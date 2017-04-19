package com.jarby.user.dao.impl;

import com.jarby.user.dao.UserDao;
import com.jarby.user.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * �๦��˵����ʵ���û������ӿ���
 * ���ߣ�Jarby
 * ����ʱ�䣺4/11/2017 1:46 PM
 * �汾��V1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    /**
     *@Author:Jarby
     *@Description:����û�
     *@Date:1:50 PM 4/11/2017
     */
    @Transactional
     public void addUser(User user) {
         Session session = sessionFactory.getCurrentSession();
         session.save(user);
     }

    /**
     *@Author:Jarby
     *@Description:�����û�id��ɾ���û�
     *@Date:1:50 PM 4/11/2017
     */
     public void delUser(int userid){

    }
    /**
     *@Author:Jarby
     *@Description:�����û�
     *@Date:1:50 PM 4/11/2017
     */
     public void updateUser(User user){

    }

    /**
     *@Author:Jarby
     *@Description:��ѯ���е��û�
     *@Date:1:50 PM 4/11/2017
     */
     public List<User> selectAllUser(){
        List<User> listUser = null;
        return listUser;
    }

    /**
     *@Author:Jarby
     *@Description:�����û�id�Ų�ѯ�����û�
     *@Date:1:50 PM 4/11/2017
     */
     public User selectUserByUserId(int userid){
        User user = null;
        return user;
    }
}
