
import entity.Person;
import mapper.IPersonOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.PersonService;

import java.util.List;

/**
 * Created by shaobo.su on 2017/7/17.
 */
public class MybatisSprintTest {
    private static ApplicationContext ctx;

    static {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public static void main(String[] args) {
        System.out.println(111);
        PersonService personService = ctx.getBean(PersonService.class);
        personService.test();
    }
}
