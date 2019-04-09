package com.github.pgcomb.spbt.template.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.CsrfException;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;
import org.springframework.security.web.csrf.MissingCsrfTokenException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Title: JsonAccessDeniedHandler <br>
 * Description: JsonAccessDeniedHandler <br>
 * Date: 2019年04月08日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public class JsonAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        Class<? extends AccessDeniedException> aClass = accessDeniedException.getClass();
        if (AuthorizationServiceException.class.isAssignableFrom(aClass)) {

        }else if (MissingCsrfTokenException.class.isAssignableFrom(aClass)) {

        }else if (InvalidCsrfTokenException.class.isAssignableFrom(aClass)) {

        }else if (CsrfException.class.isAssignableFrom(aClass)) {

        }
    }
}
