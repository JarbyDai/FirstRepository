package com.jarby.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * �๦��˵����
 * ���ߣ�Jarby
 * ����ʱ�䣺4/11/2017 2:13 PM
 * �汾��V1.0
 */
public class HibernateUtils {

    @Autowired
    private static SessionFactory sessionFactory;

    public static Session getSession(){
        Session session;
        session = sessionFactory.getCurrentSession();
        if(null == session)
            session = sessionFactory.openSession();
        return session;
    }
}
