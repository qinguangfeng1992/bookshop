import com.hzit.Starter;
import com.hzit.serviceAll.OrderDelHou;
import org.hamcrest.beans.SamePropertyValuesAs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = Starter.class)
public class TestHou {
   @Autowired
   OrderDelHou orderDelHou;
    @Test
    public void setOrderDelHou(){
        System.out.println(orderDelHou.deleteOrder("2"));
    }

}
