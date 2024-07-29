package com.blue.controller;

import com.blue.pojo.Result;
import com.blue.utils.AliOSSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.controller
 * @Author: JuferBlue
 * @CreateTime: 2024-07-29  08:15
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class UploadController {
    //1.本地上传
//    @PostMapping("/upload")
//    //上传的文件会被封装到MultipartFile对象中
//    //还需要配置单个文件最大上传大小
//    public Result upload(String username, Integer age, MultipartFile file) throws IOException {
//        //获取原始文件名
//        String originalFilename = file.getOriginalFilename();
//        //构造唯一的文件名-uuid
//        int index = originalFilename.lastIndexOf(".");
//        String suffix = originalFilename.substring(index);
//        String newFilename = UUID.randomUUID().toString()+suffix;
//        //将文件存入H:\springboot存储
//        file.transferTo(new File("H:\\springboot存储\\"+newFilename));
//
//        return Result.success();
//    }
    @Autowired
    private AliOSSUtils aliOSSUtils;
    //2.阿里云上传
    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException {
        String url = aliOSSUtils.upload(file);
        System.out.println("文件上传成功");
        System.out.println(url);
        return Result.success(url);
    }
}
