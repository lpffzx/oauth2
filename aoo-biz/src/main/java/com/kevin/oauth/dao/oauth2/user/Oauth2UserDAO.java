package com.kevin.oauth.dao.oauth2.user;

import com.kevin.oauth.dao.common.ZlBaseDao;
import com.kevin.oauth.domain.oauth2.user.Oauth2UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
public interface Oauth2UserDAO extends ZlBaseDao<Oauth2UserDO, Integer> {

    Oauth2UserDO findByUsername(String username);

}
