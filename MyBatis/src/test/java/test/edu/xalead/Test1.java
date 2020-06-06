package test.edu.xalead;

import edu.xalead.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test1 {
    private SqlSessionFactory sessionFactory=null;
    @Before
    public void init() throws Exception{
        sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
    }
    @Test
    public void testInsert() throws Exception {

        SqlSession session = null;

        try {
            session = sessionFactory.openSession();
            User u = new User();
            u.setUsername("wangmazi");
            u.setPassword("1111");
            session.insert("test.addUser", u);
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }
    @Test
    public void testSelect() throws Exception {

        SqlSession session = null;

        try {
            session = sessionFactory.openSession();
            User u=session.selectOne("test.findUserById",2);
            System.out.println(u);

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }
    @Test
    public void testSelect1() throws Exception {

        SqlSession session = null;

        try {
            session = sessionFactory.openSession();
            List<User> u=session.selectList("test.findUserByName","");
            System.out.println(u);

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testSelect2() throws Exception {

        SqlSession session = null;

        try {
            session = sessionFactory.openSession();
            Map<String,Object> params=new HashMap<String, Object>();
            params.put("user","");
            params.put("pwd","");
            List<User> u=session.selectList("test.findUserByAccount","");
            System.out.println(u);

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }
    @Test
    public void testDel() throws Exception {

        SqlSession session = null;

        try {
            session = sessionFactory.openSession();
            session.delete("test.delUserById","");
            session.commit();


        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    @Test
    public void testUpdate() throws Exception {

        SqlSession session = null;

        try {
            session = sessionFactory.openSession();
            User u=session.selectOne("test.findUserById",2);
            u.setUsername("");
            session.update("test.updateUser",u);
            session.commit();
            System.out.println(u);

        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }


}
