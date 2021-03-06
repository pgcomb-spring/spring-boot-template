package com.github.pgcomb.spbt.template.security.exception;

import com.github.pgcomb.spbt.template.config.HttpCodeSource;
import com.github.pgcomb.spbt.template.exceptionhandler.AbstractExceptionRespHandler;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.ProviderNotFoundException;
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
public class ProviderNotFoundFailureRespHandler extends AbstractExceptionRespHandler<ProviderNotFoundException>  {

    public ProviderNotFoundFailureRespHandler() {
        super(Integer.parseInt(HttpCodeSource.getAccessor().getMessage("http.code.exception.AuthenticationException.ProviderNotFoundException")),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = ProviderNotFoundException.class)
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, ProviderNotFoundException ex) throws IOException {
        super.handle(request,response,ex);
    }
}
