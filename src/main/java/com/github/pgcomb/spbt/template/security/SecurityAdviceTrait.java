package com.github.pgcomb.spbt.template.security;

import com.github.pgcomb.spbt.template.web.resp.AdviceTrait;
import com.github.pgcomb.spbt.template.web.resp.Problem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.csrf.CsrfException;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;
import org.springframework.security.web.csrf.MissingCsrfTokenException;
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
    /**
     * AccessDeniedException
     * @param e AccessDeniedException
     * @param request NativeWebRequest
     * @return ResponseEntity
     */
    @ExceptionHandler
    default ResponseEntity<Problem> handleAccessDenied(final AccessDeniedException e, final NativeWebRequest request) {
        Class<? extends AccessDeniedException> aClass = e.getClass();
        if (AuthorizationServiceException.class.isAssignableFrom(aClass)) {

        }else if (MissingCsrfTokenException.class.isAssignableFrom(aClass)) {

        }else if (InvalidCsrfTokenException.class.isAssignableFrom(aClass)) {

        }else if (CsrfException.class.isAssignableFrom(aClass)) {

        }
        return create(HttpStatus.FORBIDDEN, e, request);
    }

    @ExceptionHandler
    default ResponseEntity<Problem> handleAuthentication(final AuthenticationException e,
                                                         final NativeWebRequest request) {
        return create(HttpStatus.UNAUTHORIZED, e, request);
    }
}
