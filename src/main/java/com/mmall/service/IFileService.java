package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by gongkelvin on 2018/3/5.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
