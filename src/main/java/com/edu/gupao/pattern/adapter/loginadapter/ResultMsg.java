package com.edu.gupao.pattern.adapter.loginadapter;

import lombok.Data;

/**
 * ResultMsg类
 *
 * @author wangjixue
 * @date 2019-08-18 12:33
 */
@Data
public class ResultMsg {
    private int code;
    private String message;
    private Object data;

    public ResultMsg(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
