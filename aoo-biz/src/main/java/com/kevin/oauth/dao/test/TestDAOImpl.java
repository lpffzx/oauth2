package com.kevin.oauth.dao.test;

import com.kevin.oauth.dao.common.ZlBaseDaoImpl;
import com.kevin.oauth.domain.test.TestDO;
import org.springframework.stereotype.Repository;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
@Repository
public class TestDAOImpl extends ZlBaseDaoImpl<TestDO, Integer> implements TestDAO {

}
