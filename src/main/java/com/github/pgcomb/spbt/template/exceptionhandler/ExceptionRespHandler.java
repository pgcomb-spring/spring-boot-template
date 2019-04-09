package com.github.pgcomb.spbt.template.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Title: ExceptionRespHandler <br>
 * Description: ExceptionRespHandler <br>
 * Date: 2019年04月09日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface ExceptionRespHandler<E> {

    void handle(HttpServletRequest request, HttpServletResponse response, E ex) throws IOException;
}
