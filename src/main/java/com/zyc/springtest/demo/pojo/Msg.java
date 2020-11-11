package com.zyc.springtest.demo.pojo;

import lombok.Data;

/**
 * 返回消息体
 */
@Data
public class Msg<T> {

    private boolean ok;
    private String status;
    private String errMessage;
    private String exceptMessage;
    private T data;

}
