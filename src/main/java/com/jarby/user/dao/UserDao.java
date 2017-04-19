package com.jarby.user.dao;

import com.jarby.user.domain.User;

import java.util.List;

/**
 * �๦��˵�����û�����daoʵ�����ݿ�����ӿ�
 * ���ߣ�Jarby
 * ����ʱ�䣺4/11/2017 1:37 PM
 * �汾��V1.0
 */
public interface UserDao {
    public void addUser(User user);
    public void delUser(int userid);
    public void updateUser(User user);
    public List<User> selectAllUser();
    public User selectUserByUserId(int userid);

}
