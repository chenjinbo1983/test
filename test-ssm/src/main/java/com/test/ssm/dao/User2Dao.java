package com.test.ssm.dao;


import com.test.ssm.model.User;
import com.test.ssm.model.User2;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User2Dao {

    int insertUser(User2 user2);

    User2 getUserById(int userId);

    List<User2> getUserByName(@Param("name") String name);


}
