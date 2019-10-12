package com.donvi.admin;

import com.donvi.utils.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2019/10/12
 * @Version: 1.0
 */
@RequestMapping("/upload")
@RestController
public class UploadController {

    @RequestMapping("/image")
    @ResponseBody
    public ServerResponse uploadImage(){
        return null;
    }
}
