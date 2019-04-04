package com.github.pgcomb.spbt.template.web.error.security;

import com.github.pgcomb.spbt.template.web.error.AdviceTrait;
import com.github.pgcomb.spbt.template.web.error.Problem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Title: SecurityAdviceTrait <br>
 * Description: SecurityAdviceTrait <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface SecurityAdviceTrait extends AdviceTrait {
    @ExceptionHandler
    default ResponseEntity<Problem> handleAuthentication(final AuthenticationException e,
                                                         final NativeWebRequest request) {
        return create(HttpStatus.UNAUTHORIZED, e, request);
    }
}
