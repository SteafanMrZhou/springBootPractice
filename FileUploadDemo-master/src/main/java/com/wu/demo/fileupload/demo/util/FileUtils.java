package com.wu.demo.fileupload.demo.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件上传工具包
 */
public class FileUtils {

    /**
     *
     * @param file 文件
     * @param filePath 文件存放路径
     * @param fileName 源文件名
     * @return
     */
    public static void upload(byte[] file, String filePath, String fileName) throws Exception{
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();

//        // 生成新的文件名
//        //String realPath = path + "/" + FileNameUtils.getFileName(fileName);
//
//        //使用原文件名
//        String realPath = path + "/" + fileName;
//
//        File dest = new File(realPath);
//
//        //判断文件父目录是否存在
//        if(!dest.isDirectory()){
//            dest.mkdirs();
//        }
//
//        try {
//            //保存文件
//            file.transferTo(dest);
//            return true;
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//            return false;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false;
//        }

    }


}
