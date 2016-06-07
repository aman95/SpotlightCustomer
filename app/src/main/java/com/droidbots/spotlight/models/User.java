package com.droidbots.spotlight.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by aman on 26/05/16.
 */
public class User extends RealmObject {

    @PrimaryKey
    private String userid;
    private String name;
    private String email;
    private String phone;
    private String userDP;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
