package com.edu.gupao.pattern.adapter.poweradapter;

/**
 * AC220类
 *
 * @author wangjixue
 * @date 2019-08-18 12:20
 */
public class AC220 {

    public int outputAC220(){
        int output = 220;
        System.err.println("输出电压为："+output+"V");
        return output;
    }
}
