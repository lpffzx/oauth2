package com.kevin.oauth.service.impl.test;

import com.kevin.oauth.common.exception.CommonException;
import com.kevin.oauth.dao.test.TestDAO;
import com.kevin.oauth.dto.test.TestDTO;
import com.kevin.oauth.domain.test.TestDO;
import com.kevin.oauth.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    TestDAO testDAO;

    @Override
    public List<TestDTO> get() throws CommonException {
        List<TestDO> testP = testDAO.list();
        List<TestDTO> result = new ArrayList<>();
        for (TestDO test : testP) {
            TestDTO temp = new TestDTO();
            temp.setId(test.getId());
            temp.setTitle(test.getTitle());
            temp.setMsg(test.getMsg());
            result.add(temp);
        }
        return result;
    }
}
