package com.edu.gupao.pattern.adapter.loginadapter.v2;

import com.edu.gupao.pattern.adapter.loginadapter.ResultMsg;
import com.edu.gupao.pattern.adapter.loginadapter.SiginService;
import com.edu.gupao.pattern.adapter.loginadapter.v2.adapters.*;

/**
 * PassportForThirdAdapter类
 *
 * @author wangjixue
 * @date 2019-08-18 13:56
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {

    public ResultMsg loginForQQ(String id) {
        
        return processLogin(id, LoginForQQAdapter.class);
    }


    public ResultMsg loginForWechat(String id) {
         return processLogin(id, LoginForWechatAdapter.class);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
         return processLogin(phone, LoginForTelAdapter.class);
    }

    public ResultMsg loginForToken(String token) {
         return processLogin(token, LoginForTokenAdapter.class);
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username,password);
        return super.login(username, password);
    }

    private ResultMsg processLogin(String id, Class<? extends LoginAdapter> clazz) {
        try {
            // TODO: 2019-08-18 适配器不一定要实现接口，注意与策略模式进行区分。
            LoginAdapter adapter = clazz.newInstance();
            // 判断传入的参数是否能处理登录逻辑
            if(adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
