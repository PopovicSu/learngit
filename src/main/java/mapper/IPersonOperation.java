package mapper;

import entity.Article;
import entity.Person;

import java.util.List;

/**
 * Created by shaobo.su on 2017/7/17.
 */
public interface IPersonOperation {
    int insertPerson(Person person);

    Person queryById(int id);

    int updatePerson(Person person);

    List<Person> selectAllPersons(String userName);

    int deletePersonById(int id);

    List<Article> getPersonArticles(int userid);

}
