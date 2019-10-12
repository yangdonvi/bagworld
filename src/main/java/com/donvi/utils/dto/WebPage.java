package com.donvi.utils.dto;

/**
 * @Description:
 * @Author: yangdongwei
 * @CreateDate: 2019/10/12
 * @Version: 1.0
 */
public class WebPage {
    private int pageno;

    private int pagesize;

    private int total;

    public WebPage(int pageno, int pagesize, int total) {
        this.pageno = pageno;
        this.pagesize = pagesize;
        this.total = total;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageno() {
        return pageno;
    }

    public int getPagesize() {
        return pagesize;
    }

    public int getTotal() {
        return total;
    }
}
