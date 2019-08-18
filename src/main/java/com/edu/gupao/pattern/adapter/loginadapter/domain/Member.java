package com.edu.gupao.pattern.adapter.loginadapter.domain;

import lombok.Data;

/**
 * Member类
 *
 * @author wangjixue
 * @date 2019-08-18 12:37
 */
@Data
public class Member {

    private Long memnerId;

    private String username;

    private String password;

    private String info;

    public Member() {

    }

    public Member(String userName, String password) {
        System.err.println("用户名："+userName+"，密码："+password);
    }
}
