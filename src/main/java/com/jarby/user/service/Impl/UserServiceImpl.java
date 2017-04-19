package com.jarby.user.service.Impl;

import com.jarby.user.dao.UserDao;
import com.jarby.user.domain.User;
import com.jarby.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * �๦��˵����
 * ���ߣ�Jarby
 * ����ʱ�䣺4/11/2017 3:02 PM
 * �汾��V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save(User user){
        userDao.addUser(user);
    }

}
