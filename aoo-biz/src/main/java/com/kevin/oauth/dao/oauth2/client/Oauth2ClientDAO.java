package com.kevin.oauth.dao.oauth2.client;

import com.kevin.oauth.dao.common.ZlBaseDao;
import com.kevin.oauth.domain.oauth2.client.Oauth2ClientDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
public interface Oauth2ClientDAO extends ZlBaseDao<Oauth2ClientDO, Integer> {

    Oauth2ClientDO findByClientId(String clientId);

    Oauth2ClientDO findByClientSecret(String clientSecret);
}
