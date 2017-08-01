package service;

import entity.person.Person;
import entity.studentInfo.CourseGrade;
import entity.studentInfo.Student;
import mapper.ICourseGradeOperationMapper;
import mapper.IIdentityCardOperationMapper;
import mapper.IPersonOperationMapper;
import mapper.IStudentOperationMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shaobo.su on 2017/7/17.
 3rfewwwww
 */
@Service
public class PersonService {

    @Resource
    private IPersonOperationMapper personOperation;

    @Resource
    private IIdentityCardOperationMapper identityCardOperationMapper;

    @Resource
    private IStudentOperationMapper studentOperationMapper;

    @Resource
    private ICourseGradeOperationMapper courseGradeOperationMapper;

    public void test(){

        System.out.println(personOperation);

        List<Person> personList = personOperation.selectAllPersons("test");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public void test1(){
        System.out.println(personOperation.queryByIdOrNull(-1));
        return ;
    }
    public void test2(){
        Person person1=new Person();
        person1.setUserName("test");
        Person person2=new Person();
        person2.setAge(20);
        Person person3=new Person();
        person3.setMobilePhone("111");
        System.out.println("期待输出所有数据：\n"+personOperation.queryByAnotherOccasion(person1));
        System.out.println("期待输出1条年龄等于20的数据：\n"+personOperation.queryByAnotherOccasion(person2));
        System.out.println("期待输出所有数据：\n"+personOperation.queryByAnotherOccasion(person3));
    }
    public void test3(){
        System.out.println("更新返回的值是：" + personOperation.updateNewPerson(50, "Lebron"));
    }
    public void test4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("123300238");
        list.add("180000000");
        System.out.println(personOperation.selectPersonInMobilePhoneList(list));
    }
    public void test5(){
        System.out.println(personOperation.selectMobilePhoneListFromPhoneFragment("%011%"));
    }
    public void test6(){
        Person person = new Person();
        person.setAge(50);
        System.out.println(personOperation.selectNewPerson(person));
    }
    public void test7(){
        Map<String, Integer> map = new HashMap<>();
        map.put("myAge",50);
        System.out.println(personOperation.selectNewPersonByMap(map));
    }
    public void test8(){
        System.out.println(identityCardOperationMapper.findIdentityCardByStudentId("001"));
    }
    public void test9(){
        List<Student> studentList=studentOperationMapper.findStudentByStudentId("001");
        List<CourseGrade> courseGradeList=courseGradeOperationMapper.findCourseGradeListByStudentId("001");

        for (Student student : studentList) {
            student.setCourseGradeList(courseGradeList);
        }

        System.out.println(studentList);
        System.out.println(studentOperationMapper);
    }

}
