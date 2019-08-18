package com.edu.gupao.pattern.adapter.loginadapter.v2.adapters;

import com.edu.gupao.pattern.adapter.loginadapter.ResultMsg;

/**
 * LoginAdapter类
 *
 * @author wangjixue
 * @date 2019-08-18 13:17
 */
public interface RegistAdapter {
   <T> boolean support(T adapter);

   <T> ResultMsg regist(String id, T adapter);

}
