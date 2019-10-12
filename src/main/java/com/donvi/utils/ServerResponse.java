package com.donvi.utils;

import com.donvi.utils.dto.WebPage;
import java.io.Serializable;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2019/10/12
 * @Version: 1.0
 */
public class ServerResponse<T> implements Serializable {
    public static final long serialVersionUID = -7743624840999524733L;

    private String code;

    private String msg;

    private T data;

    private WebPage webPage;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setWebPage(WebPage webPage) {
        this.webPage = webPage;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public WebPage getWebPage() {
        return webPage;
    }
}
