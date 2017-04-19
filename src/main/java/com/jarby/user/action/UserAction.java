package com.jarby.user.action;

import com.jarby.user.dao.UserDao;
import com.jarby.user.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

/**
 * �๦��˵�����û���������ʵ��
 * ���ߣ�Jarby
 * ����ʱ�䣺4/11/2017 3:11 PM
 * �汾��V1.0
 */
@Scope("prototype")
@Namespace("/")
public class UserAction extends ActionSupport {

    @Autowired
    private UserDao userDao;

    @Action(value="save",results={@Result(name="success",location="/index.jsp"),
            @Result(name="error",location="/index.jsp")})
    public String save(){
        System.out.println("this is save method!!!");
        User user = new User();
        user.setPassword("11111111");
        user.setUsername("Jarby");
        userDao.addUser(user);
        return SUCCESS;
    }

    public String Execute(){
        System.out.println("this is save execute!!!");
        return SUCCESS;
    }
}
