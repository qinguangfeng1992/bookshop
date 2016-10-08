import com.hzit.Starter;
import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.vo.BookVo;
import com.hzit.service.OrderDelHou;

import com.hzit.service.OrderXie;
import org.hamcrest.beans.SamePropertyValuesAs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = Starter.class)
public class TestHou {
   @Autowired
   OrderDelHou orderDelHou;
    @Autowired
    OrderXie orderXie;
    @Test
    public void setOrderDelHou(){
        System.out.println(orderDelHou.Allorder("1","1"));
    }
    @Test
    public void setuser(){
        List<Orderdetail> orderdetails=orderDelHou.Aorder("1");
        for (Orderdetail o:orderdetails) {
            System.out.println("书籍id:"+o.getBookid());
        }

    }
    @Test
    public void update(){
       orderXie.orderOfuserid("1");


    }
}
