package com.mBook.application.exceptionHandler;

import com.mBook.application.model.HeaderModel;
import com.mBook.application.status.HeaderStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class BaseExceptionHandlerAdvice {
    Logger logger = LoggerFactory.getLogger(BaseExceptionHandlerAdvice.class);
    @ExceptionHandler
    @ResponseBody
    public HeaderModel handle(Exception e){
        logger.info("mBook全局错误拦截,抛出异常：{}",e.getMessage());
        e.printStackTrace();
        return new HeaderModel(HeaderStatus.ERROR,"");
    }
}
