package com.userdata.Assignement.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userid;
    String username;
    String password;
    String fullname;
    String roleid;
    Boolean active=true ;

    public user() {
    }

    public user(int userid, String username, String password, String fullname, String roleid, Boolean active) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.roleid = roleid;
        this.active = active;
    }

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
