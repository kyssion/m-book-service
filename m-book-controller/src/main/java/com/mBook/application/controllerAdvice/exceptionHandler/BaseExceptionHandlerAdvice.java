package com.mBook.application.controllerAdvice.exceptionHandler;

import com.mBook.application.model.HeaderModel;
import com.mBook.application.status.HeaderStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * create 2018/8/21 kyssion
 * 全局异常拦截
 */
@ControllerAdvice
public class BaseExceptionHandlerAdvice {
    Logger logger = LoggerFactory.getLogger(BaseExceptionHandlerAdvice.class);
    @ExceptionHandler
    @ResponseBody
    public HeaderModel handle(Exception e) throws CloneNotSupportedException {
        logger.info("mBook全局错误拦截,抛出异常：{}",e.getMessage());
        e.printStackTrace();
        return HeaderModel.createHeaderModel(HeaderStatus.ERROR,"");
    }
}