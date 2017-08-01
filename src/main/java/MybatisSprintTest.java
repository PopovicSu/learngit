
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.PersonService;

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
//        personService.test();
//        personService.test1();
//        personService.test2();
//        personService.test3();
//        personService.test4();
//        personService.test5();
//        personService.test6();
//        personService.test7();
//        personService.test8();
        personService.test9();

        return;
    }
}
