package com.github.pgcomb.spbt.template.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Title: ExceptionHandler <br>
 * Description: ExceptionHandler <br>
 * Date: 2019年04月09日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface ExceptionHandler<E> {

    void handle(HttpServletRequest request, HttpServletResponse response, E ex);

    ResponseEntity handle(E e, NativeWebRequest request);
}
