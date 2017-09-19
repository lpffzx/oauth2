package com.kevin.oauth.dao.oauth2.client;

import com.kevin.oauth.dao.common.ZlBaseDaoImpl;
import com.kevin.oauth.domain.oauth2.client.Oauth2ClientDO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
@Repository
public class Oauth2ClientDAOImpl extends ZlBaseDaoImpl<Oauth2ClientDO, Integer> implements Oauth2ClientDAO {

    @Override
    public Oauth2ClientDO findByClientId(String clientId) {
        CriteriaQuery<Oauth2ClientDO> c = getCriteriaBuilder().createQuery(getEntityClass());
        Root<Oauth2ClientDO> r = c.from(Oauth2ClientDO.class);
        c.select(c.from(getEntityClass()));
        addEq(c, r, "clientId", clientId);
        return getEntityManager().createQuery(c).getSingleResult();
    }

    @Override
    public Oauth2ClientDO findByClientSecret(String clientSecret) {
        CriteriaQuery<Oauth2ClientDO> c = getCriteriaBuilder().createQuery(getEntityClass());
        Root<Oauth2ClientDO> r = c.from(Oauth2ClientDO.class);
        c.select(c.from(getEntityClass()));
        addEq(c, r, "clientSecret", clientSecret);
        return getEntityManager().createQuery(c).getSingleResult();
    }

}
