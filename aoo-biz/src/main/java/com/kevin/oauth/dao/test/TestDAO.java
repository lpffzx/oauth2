package com.kevin.oauth.dao.test;

import com.kevin.oauth.domain.test.TestDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDAO extends JpaRepository<TestDO, Integer> {

}
