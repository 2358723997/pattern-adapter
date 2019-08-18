package com.edu.gupao.pattern.adapter.loginadapter;

import com.edu.gupao.pattern.adapter.loginadapter.domain.Member;

/**
 * SiginService类
 *
 * @author wangjixue
 * @date 2019-08-18 12:35
 */
public class SiginService {

    /**
     * 注册
     * @param userName
     * @param password
     * @return
     */
    public ResultMsg regist(String userName,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    public ResultMsg login(String userName,String password){
        return new ResultMsg(200,"用户："+userName+"登录成功",null);
    }

}
