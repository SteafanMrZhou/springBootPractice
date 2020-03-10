package com.autumn.model;

import lombok.Data;

@Data
public class ImageUpload {
    private String imgpath;


    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }
}