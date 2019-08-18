package com.edu.gupao.pattern.adapter.poweradapter;

import lombok.Data;

/**
 * PowerAdapter类
 *
 * @author wangjixue
 * @date 2019-08-18 12:22
 */
@Data
public class PowerAdapter implements DC5{

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5() {
        int outputAC220 = ac220.outputAC220();
        int outputDC = outputAC220 / 44;
        System.err.println("输出的直流电压为："+outputDC+"V");
        return outputDC;
    }
}
