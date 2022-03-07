import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhang
 * @date: 2022/3/4
 * @description:
 */
public class MyTest {
    public static void main(String[] args) {

        //Spring容器，就类似于婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        UserT user2 = (UserT) context.getBean("u2");
        user.show();



    }
}
