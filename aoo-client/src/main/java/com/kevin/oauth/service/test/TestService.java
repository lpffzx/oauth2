package com.kevin.oauth.service.test;

import com.kevin.oauth.common.exception.CommonException;
import com.kevin.oauth.dto.test.TestDTO;

import java.util.List;

public interface TestService {

    List<TestDTO> get() throws CommonException;
}
