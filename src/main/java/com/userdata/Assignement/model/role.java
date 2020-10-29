package com.userdata.Assignement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class role {

    @Id
    String roleid;
    String rolediscription;

    public String getRoletype() {
        return roleid;
    }

    public void setRoletype(String roletype) {
        this.roleid = roletype;
    }

    public String getRolediscription() {
        return rolediscription;
    }

    public void setRolediscription(String rolediscription) {
        this.rolediscription = rolediscription;
    }



}
