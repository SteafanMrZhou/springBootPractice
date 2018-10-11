package com.wu.demo.fileupload.demo.controller;

import com.autumn.mapper.UserMapper;
import com.autumn.model.User;
import com.wu.demo.fileupload.demo.service.IImgUploadService;
import com.wu.demo.fileupload.demo.util.FileUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
@MapperScan("com.autumn.mapper")
public class TestController {

    private final ResourceLoader resourceLoader;

    private static final Logger logger = LoggerFactory.getLogger("TestController.class");

    @Autowired
    private IImgUploadService iImgUploadService;


    @Autowired
    public TestController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }


    @Value("${web.upload-path}")
    private String path;

    @Value("${server.port}")
    private String port;

    /**
     * 跳转到文件上传页面
     * @return
     */
    @RequestMapping("test")
    public String toUpload(){
        return "test";
    }

    /**
     *
     * @param file 要上传的文件
     * @return
     */
    @RequestMapping(value = "fileUpload", method = RequestMethod.POST)
    public @ResponseBody String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request){

        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath(path);
        logger.error("filename1:" + fileName);
        logger.error("filePath1:" + filePath);

        try {
            FileUtils.upload(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 拼接图片url
        String imgHost = "http://127.0.0.1:" + port;
        String imgUploadPath = path;
        String imgName = fileName;
        String imgPath = imgHost + imgUploadPath + imgName;

        logger.error("拼接好的图片上传路径为：" + imgPath);

        return "upload img success，请到上传路径查看！" + iImgUploadService.imgUpload(imgPath);

    }

}
