package com.donvi.admin.controller;

import com.donvi.utils.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2019/10/12
 * @Version: 1.0
 */
@RequestMapping("/upload")
@RestController
public class UploadController {
    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @RequestMapping("/image")
    @ResponseBody
    public ServerResponse uploadImage(@RequestParam("testUploadImage") MultipartFile[] myfile, HttpServletRequest request) throws IOException {
        String uploadPath = request.getSession().getServletContext().getRealPath("/img") + "/";
        String fileName = myfile[0].getOriginalFilename();
        String realFilePath = uploadPath + fileName;
        logger.info("保存图片路径为：realFilePath = {}",realFilePath);
        File uploadFile = new File(realFilePath);
        myfile[0].transferTo(uploadFile);
        return null;
    }
}
