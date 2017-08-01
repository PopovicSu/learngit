import entity.person.Article;
import entity.person.Person;
import mapper.IPersonOperationMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.MybatisUtil;

import java.util.List;

/**
 * Created by shaobo.su on 2017/7/17.
 */
public class UserTest {

    private SqlSession sqlSession;
    private IPersonOperationMapper personOperation;
    private Logger logger;

    @Before
    public void init() {
        sqlSession = MybatisUtil.getSqlSession();
        personOperation = sqlSession.getMapper(IPersonOperationMapper.class);
        logger = LoggerFactory.getLogger(UserTest.class);
    }


    @Test
    public void insertPerson() {
        int id = 10016;
        String userName = "test";
        int age = 18;
        String mobilePhone = "18011000000";
        Person person = new Person();
        person.setId(id);
        person.setAge(age);
        person.setUserName(userName);
        person.setMobilePhone(mobilePhone);
        try {
            //这两块的功能是一样的
//            sqlSession.insert("insertPerson",person);
//            sqlSession.commit();
            personOperation.insertPerson(person);
            sqlSession.commit();//这句话必须要添加，否则会写入失败
        } catch (Exception e) {
            logger.info("exception", e);
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

    @Test
    public void queryById() {
        //得到sqlSession
        int id = 22;
        try {
            //用sqlSession做查询
            Person person = sqlSession.selectOne("queryById", id);

            sqlSession.commit();
            System.out.println(person);
        } catch (Exception e) {
            logger.info("exception", e);
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

    @Test
    public void selectAllPersons() {
        //得到sqlSession
        //用sqlSession得到这个接口对象
        IPersonOperationMapper personOperation = sqlSession.getMapper(IPersonOperationMapper.class);
        //用这个接口对象调用方法进行查询
        List<Person> personList = personOperation.selectAllPersons("test");
        System.out.println("输出结果:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void updatePerson() {
        IPersonOperationMapper personOperation = sqlSession.getMapper(IPersonOperationMapper.class);
        Person person = new Person();
        int result = personOperation.updatePerson(person);
        sqlSession.commit();
        System.out.print(result);
    }

    @Test
    public void deletePersonById() {
        int result = personOperation.deletePersonById(22);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getPersonArticles() {
        List<Article> articles = personOperation.getPersonArticles(1);
        logger.info("返回的articles总数:" + articles.size());
        for (Article article : articles) {
            System.out.println("文章名字:" + article.getTitle() + ":" + "文章内容:" + article.getContent() +
                    ":作者是:" + article.getPerson().getUserName() + ":电话:" +
                    article.getPerson().getMobilePhone());
        }
        sqlSession.close();
    }

}
