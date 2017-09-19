package com.kevin.oauth.dto.oauth2.user;

import java.io.Serializable;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
public class Oauth2UserDTO implements Serializable {

    private int id;

    private String username;

    private String password;

    private String salt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }
}