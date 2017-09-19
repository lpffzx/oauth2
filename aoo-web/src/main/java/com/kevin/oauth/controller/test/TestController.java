package com.kevin.oauth.controller.test;

import com.kevin.oauth.common.constant.UTF8MediaType;
import com.kevin.oauth.common.exception.CommonException;
import com.kevin.oauth.common.result.CommonResult;
import com.kevin.oauth.controller.Base4ClientController;
import com.kevin.oauth.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;


@RestController
@RequestMapping("test")
public class TestController extends Base4ClientController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = UTF8MediaType.JSON)
    public CommonResult createFamily(@Context HttpServletRequest request) throws CommonException {
        CommonResult result = CommonResult.success(testService.get());
        return result;
    }
}
