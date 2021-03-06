package com.kevin.oauth.dto.oauth2.client;

import java.io.Serializable;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
public class Oauth2ClientPDTO implements Serializable {
    private int id;

    private String clientName;

    private String clientId;

    private String clientSecret;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
