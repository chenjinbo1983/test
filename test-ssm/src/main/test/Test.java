import com.test.ssm.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        UserController userController = (UserController) context.getBean("userController");
    }

}
