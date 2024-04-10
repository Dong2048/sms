package com.zagt.Handler;
import com.zagt.utils.BaseResponse;
import com.zagt.utils.BusinessException;
import com.zagt.utils.ErrorCode;
import com.zagt.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName Application
 * @Description 全局异常处理器，Slf4j是用来记录日志信息的，lombok中自带的。
 * @Author dong
 * @Date 2024/4/9
 * @Version 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e){
        log.error("BusinessException"+e.getMessage(),e);
        //return new BaseResponse(e.getCode(),e.getMessage(),e.getDescription());
        return ResultUtils.error(e.getCode(),e.getMessage(),e.getDescription());
    }
 
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(RuntimeException e){
        //集中处理
        log.error("RuntimeException",e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR,e.getMessage());
    }
}