package com.kevin.oauth.common.exception.lifepay;

import com.kevin.oauth.common.exception.CommonException;
import com.kevin.oauth.common.result.CommonErrorMessage;

public class LifePayException extends CommonException {
    public LifePayException(CommonErrorMessage message) {
        super(message);
    }
}
