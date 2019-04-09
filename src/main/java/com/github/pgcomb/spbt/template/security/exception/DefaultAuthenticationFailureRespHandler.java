package com.github.pgcomb.spbt.template.security.exception;

import com.github.pgcomb.spbt.template.config.HttpCodeSource;
import com.github.pgcomb.spbt.template.exceptionhandler.AbstractExceptionRespHandler;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Title: DefaultAuthenticationFailureRespHandler <br>
 * Description: DefaultAuthenticationFailureRespHandler <br>
 * Date: 2019年04月09日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
@ControllerAdvice
public class DefaultAuthenticationFailureRespHandler extends AbstractExceptionRespHandler<AuthenticationException> implements AuthenticationFailureHandler  {

    public DefaultAuthenticationFailureRespHandler() {
        super(Integer.parseInt(HttpCodeSource.getAccessor().getMessage("http.code.exception.AuthenticationException")), "认证异常", HttpStatus.FORBIDDEN);
    }

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        handle(request,response,exception);
    }
    @org.springframework.web.bind.annotation.ExceptionHandler(value = AuthenticationException.class)
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AuthenticationException ex) throws IOException {
        super.handle(request,response,ex);
    }
}
