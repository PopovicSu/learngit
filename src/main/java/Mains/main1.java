package Mains;

import entity.Person;
import mapper.IPersonOperation;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

/**
 * Created by shaobo.su on 2017/7/17.
 */
public class main1 {
    public static void main(String[] args){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        try{
            IPersonOperation personOperation = sqlSession.getMapper(IPersonOperation.class);
            Person person=personOperation.queryById(22);
            System.out.println(person.toString());
        }finally {
            sqlSession.close();
        }
    }
}
