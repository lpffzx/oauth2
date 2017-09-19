package com.kevin.oauth.dao.test;

import com.kevin.oauth.dao.common.ZlBaseDao;
import com.kevin.oauth.domain.test.TestDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TestDAO extends ZlBaseDao<TestDO, Integer> {

}
