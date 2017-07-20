package utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by shaobo.su on 2017/7/17.
 */
public class MybatisUtil {
    private final static SqlSessionFactory sqlSessionFactory;

    private static Logger logger;

    static {
        logger = LoggerFactory.getLogger(MybatisUtil.class);
        String resource = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            logger.info("context", e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    /**
     * 获取SqlSessionFactory
     *
     * @return SqlSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    /**
     * 获取SqlSession
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession() {

        return sqlSessionFactory.openSession();
    }

    /**
     * 关闭SqlSession
     */
    public static void closeSession(SqlSession sqlSession) {
        if (sqlSession != null)
            sqlSession.close();
    }
}