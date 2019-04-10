package com.github.pgcomb.spbt.template.security.exception;

import com.github.pgcomb.spbt.template.config.HttpCodeSource;
import com.github.pgcomb.spbt.template.exceptionhandler.AbstractExceptionRespHandler;
import com.github.pgcomb.spbt.template.security.config.SecurityMsgSource;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AccountStatusException;
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
public class AccountStatusFailureRespHandler extends AbstractExceptionRespHandler<AccountStatusException>  {

    public AccountStatusFailureRespHandler() {
        super(Integer.parseInt(HttpCodeSource.getAccessor().getMessage("http.code.exception.AuthenticationException.AccountStatusException")),
                SecurityMsgSource.getAccessor().getMessage("http.msg.AccountStatusFailureRespHandler"),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = AccountStatusException.class)
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccountStatusException ex) throws IOException {
        super.handle(request,response,ex);
    }
}
