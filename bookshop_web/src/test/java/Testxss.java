import com.hzit.Starter;
import com.hzit.dao.entity.Order;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.service.OrderXie;
import com.hzit.service.serviceImpl.BookImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = Starter.class)
public class Testxss {

@Autowired
private BookImpl bookImpl;
    @Autowired
    OrderXie orderXie;
    @Test
    public void testFindBookAll() {
       List<BookVo> list= bookImpl.findBookAll();
        for (BookVo b:list){
            System.out.println(b.getBookname());
        }
    }
    @Test
    public void findOrderid() {

    }


}
