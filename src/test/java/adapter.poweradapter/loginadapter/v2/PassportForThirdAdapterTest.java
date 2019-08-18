package adapter.poweradapter.loginadapter.v2;

import com.alibaba.fastjson.JSON;
import com.edu.gupao.pattern.adapter.loginadapter.ResultMsg;
import com.edu.gupao.pattern.adapter.loginadapter.v2.IPassportForThird;
import com.edu.gupao.pattern.adapter.loginadapter.v2.PassportForThirdAdapter;

/**
 * PassportForThirdAdapterTest类
 *
 * @author wangjixue
 * @date 2019-08-18 14:12
 */
public class PassportForThirdAdapterTest {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        ResultMsg msg = ((PassportForThirdAdapter) adapter).login("tom", "12334");
        System.err.println(JSON.toJSONString(msg));
        ResultMsg resultMsg = adapter.loginForQQ("12345");
        System.err.println(JSON.toJSONString(resultMsg));
    }
}
