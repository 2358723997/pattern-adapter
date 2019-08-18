package adapter.poweradapter.poweradapter;

import com.edu.gupao.pattern.adapter.poweradapter.AC220;
import com.edu.gupao.pattern.adapter.poweradapter.DC5;
import com.edu.gupao.pattern.adapter.poweradapter.PowerAdapter;
import lombok.Data;

/**
 * PowerAdapter类
 *
 * @author wangjixue
 * @date 2019-08-18 12:22
 */
@Data
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5 dc = new PowerAdapter(new AC220());
        dc.outputDC5();
    }
}
