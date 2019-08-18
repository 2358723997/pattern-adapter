package adapter.poweradapter.loginadapter.v1;

import com.alibaba.fastjson.JSON;
import com.edu.gupao.pattern.adapter.loginadapter.ResultMsg;
import com.edu.gupao.pattern.adapter.loginadapter.v1.SiginForThirdService;

/**
 * SiginForThirdServiceTest类
 *
 * @author wangjixue
 * @date 2019-08-18 13:02
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SiginForThirdService service = new SiginForThirdService();
        service.login("tom","123456");
        service.loginForTelphone("12345641234","2345");
        service.loginForToken("wer3242dw");
        ResultMsg resultMsg = service.loginForQQ("asdfg");
        System.err.println(JSON.toJSONString(resultMsg));
    }
}
