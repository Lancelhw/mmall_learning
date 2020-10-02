package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);   //根据主键ID删除数据

    int insert(User record);   //插入数据，使用User对象

    int insertSelective(User record);   //插入部分选择，使用User对象

    User selectByPrimaryKey(Integer id);   //根据主键ID进行查询

    int updateByPrimaryKeySelective(User record);   //根据主键ID选择部分更新，使用User对象

    int updateByPrimaryKey(User record);   //根据主键ID选择更新，使用User对象

    int checkUserName(String username);

    int checkEmail(String email);

    User selectLogin(@Param("username") String username,@Param("password") String password);

    String selectQuestionByUserName(String username);

    int checkAnswer(@Param("username") String username,@Param("question")String question,@Param("answer")String answer);

    int updatePasswordByUserName(@Param("username") String username,@Param("passwordNew") String passwordNew);

    int checkPassword(@Param("password") String password,@Param("userId") Integer userId);

    int checkEmailByUserId(@Param("email") String email,@Param("userId") Integer userId);
}