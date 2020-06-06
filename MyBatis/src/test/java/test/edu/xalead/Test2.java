package test.edu.xalead;

import edu.xalead.entity.User;
import edu.xalead.entity.edu.xalead.dao.动态代理模式;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Test2 {
    private SqlSessionFactory sessionFactory=null;
    @Before
    public void init() throws Exception{
        sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
    }
    @Test
    public void test1(){
        SqlSession session=null;
        try {
            session=sessionFactory.openSession();
            动态代理模式 a=session.getMapper(动态代理模式.class);
            User u=a.findById(2);
            System.out.println(u);
            a.delById(1);
            List<User> us=a.findAll();
            System.out.println(us);
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }finally {
            if (session!=null)session.close();
        }
    }
}
