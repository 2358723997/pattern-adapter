package com.edu.gupao.pattern.adapter.loginadapter.v2;

import com.edu.gupao.pattern.adapter.loginadapter.ResultMsg;

/**
 * IPassportForThird接口
 *
 * @author wangjixue
 * @date 2019-08-18 13:42
 */
public interface IPassportForThird {
    /**
     * QQ登录
     * @param id
     * @return
     */
   ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 手机号登录
     * @param phone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String phone,String code);

    /**
     * 记住登录状态自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 注册后自动登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg loginForRegist(String username,String password);

}
