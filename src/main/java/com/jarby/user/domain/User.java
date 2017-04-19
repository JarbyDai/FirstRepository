package com.jarby.user.domain;


import javax.persistence.*;

/**
 * �๦��˵�����û���Ϣʵ����
 * ���ߣ�Jarby
 * ����ʱ�䣺4/11/2017 11:39 AM
 * �汾��V1.0
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public User() {

    }
    public User(int userId,String userName,String password) {
        this.userid = userId;
        this.username = userName;
        this.password = password;
    }
    public User(String userName,String password) {
        this.username = userName;
        this.password = password;
    }
}
