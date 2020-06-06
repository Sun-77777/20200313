package edu.xalead.entity.edu.xalead.dao;

import edu.xalead.entity.Goods;
import edu.xalead.entity.IDCard;
import edu.xalead.entity.User;
import org.apache.ibatis.annotations.*;


import java.util.List;

/**
 *
 */
public interface 动态代理模式 {
    @Results(
            id="resultMap",
            value = {
                    @Result(id = true, property = "id", column = "uid"),
                    @Result(property = "username", column = "user"),
                    @Result(property = "password",column = "pwd"),
                    @Result(column = "uid", property = "idCard", one = @One(select = "findIdCardById")),
                    @Result(property = "goods",column = "uid",many = @Many(select = "findGoodsByUid"))
            }
    )
    @Select("select * from t_idcard where uid=#{uid}")
    public IDCard findIdCardById(int uid);

    @Select("select * from t_user where uid=#{id}")
    public User findById(int id);

    @Delete("delete from t_user where uid=#{id}")
    public void delById(int id);

    @Select("select * from t_goods where uid=#{uid}")
    public List<Goods> findGoodsByUid(int uid);

    @Select("select * from t_user")
    @ResultMap("resultMap")

    public List<User> findAll();
}
