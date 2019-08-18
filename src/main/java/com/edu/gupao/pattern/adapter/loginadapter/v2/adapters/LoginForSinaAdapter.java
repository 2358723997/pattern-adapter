package com.edu.gupao.pattern.adapter.loginadapter.v2.adapters;

import com.edu.gupao.pattern.adapter.loginadapter.ResultMsg;

/**
 * LoginForQQAdapter类
 *
 * @author wangjixue
 * @date 2019-08-18 13:19
 */
public class LoginForSinaAdapter implements LoginAdapter{
    public <T> boolean support(T adapter) {
        return adapter instanceof LoginAdapter;
    }

    public <T> ResultMsg login(String id, T adapter) {
        return null;
    }
}
