package com.github.pgcomb.spbt.template.security.exception;

import com.github.pgcomb.spbt.template.exceptionhandler.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Title: DefaultAuthenticationFailureHandler <br>
 * Description: DefaultAuthenticationFailureHandler <br>
 * Date: 2019年04月09日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */

public class DefaultAuthenticationFailureHandler implements AuthenticationFailureHandler, ExceptionHandler<AuthenticationException> {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

    }
    @org.springframework.web.bind.annotation.ExceptionHandler
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AuthenticationException ex) {
    }

    @Override
    public ResponseEntity handle(AuthenticationException e, NativeWebRequest request) {
        return null;
    }
}
