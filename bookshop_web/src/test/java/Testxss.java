import com.fc.platform.commons.page.Page;
import com.hzit.Starter;
import com.hzit.dao.entity.Order;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.service.Login;
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
    @Autowired
    Login login;
    @Test
    public void testFindBookAll() {
       List<BookVo> list= bookImpl.findBookAll();
        for (BookVo b:list){
            System.out.println(b.getBookname());
        }
    }
    @Test
    public void login() {
      login.findUser("12",null);
    }
    @Test
    public void fenye() {
       Page<Order> p= orderXie.findPage("1", 0, 2);
        for(Order o: p){
            System.out.println(o.getOrderid());
        }
        System.out.println("总页数"+p.getTotalPages());
        System.out.println("总行数"+p.getTotalElements());
    }


}
