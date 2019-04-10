package com.github.pgcomb.spbt.template.security.exception;

import com.github.pgcomb.spbt.template.config.HttpCodeSource;
import com.github.pgcomb.spbt.template.exceptionhandler.AbstractExceptionRespHandler;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

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
public class SessionAuthenticationFailureRespHandler extends AbstractExceptionRespHandler<SessionAuthenticationException>  {

    public SessionAuthenticationFailureRespHandler() {
        super(Integer.parseInt(HttpCodeSource.getAccessor().getMessage("http.code.exception.AuthenticationException.SessionAuthenticationException")),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = SessionAuthenticationException.class)
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, SessionAuthenticationException ex) throws IOException {
        super.handle(request,response,ex);
    }
}
