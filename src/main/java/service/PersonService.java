package service;

import entity.Person;
import mapper.IPersonOperation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shaobo.su on 2017/7/17.
 */
@Service
public class PersonService {

    @Resource
    private IPersonOperation personOperation;

    public void test(){

        System.out.println(personOperation);

        List<Person> personList = personOperation.selectAllPersons("test");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

}
