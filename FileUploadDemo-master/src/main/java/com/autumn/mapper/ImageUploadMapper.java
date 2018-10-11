package com.autumn.mapper;

import com.autumn.model.ImageUpload;

public interface ImageUploadMapper {
    int insert(ImageUpload record);

    int insertSelective(ImageUpload record);

    int insertImgPath(String imgPath);
}