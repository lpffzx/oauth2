package com.kevin.oauth.dao.oauth2.user;

import com.kevin.oauth.dao.common.ZlBaseDaoImpl;
import com.kevin.oauth.domain.oauth2.user.Oauth2UserDO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
@Repository
public class Oauth2UserDAOImpl extends ZlBaseDaoImpl<Oauth2UserDO, Integer> implements Oauth2UserDAO {
    @Override
    public Oauth2UserDO findByUsername(String username) {
        CriteriaQuery<Oauth2UserDO> c = getCriteriaBuilder().createQuery(getEntityClass());
        Root<Oauth2UserDO> r = c.from(Oauth2UserDO.class);
        c.select(c.from(getEntityClass()));
        addEq(c, r, "username", username);
        return getEntityManager().createQuery(c).getSingleResult();
    }
}
