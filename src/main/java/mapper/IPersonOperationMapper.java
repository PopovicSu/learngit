package mapper;

import entity.person.NewPerson;
import entity.person.Article;
import entity.person.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by shaobo.su on 2017/7/17.
 */
public interface IPersonOperationMapper {
    //mybatis 基础篇学习
    int insertPerson(Person person);

    Person queryById(int id);

    int updatePerson(Person person);

    List<Person> selectAllPersons(String userName);

    int deletePersonById(int id);

    List<Article> getPersonArticles(int userid);

    //mybatis进阶篇学习
    List<Person> queryByIdOrNull(@Param(value = "id") int id);

    List<Person> queryByAnotherOccasion(Person person);

    int updateNewPerson(@Param(value = "age") int age, @Param(value = "userName") String userName);

    List<Person> selectPersonInMobilePhoneList(@Param(value = "mobilePhoneList") List<String> mobilePhoneList);

    List<Person> selectMobilePhoneListFromPhoneFragment(@Param(value = "phoneFragment") String phoneFragment);

    List<NewPerson> selectNewPerson(Person person);

    List<NewPerson> selectNewPersonByMap(Map map);


}
