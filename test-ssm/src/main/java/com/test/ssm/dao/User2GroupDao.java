package com.test.ssm.dao;


import com.test.ssm.model.Group;
import com.test.ssm.model.User;
import com.test.ssm.model.User2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User2GroupDao {

    List<Group> getGroupsByUserId(int userId);


}
