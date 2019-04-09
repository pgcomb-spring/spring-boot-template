package com.github.pgcomb.spbt.template.web.resp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Title: RoutingAdviceTrait <br>
 * Description: RoutingAdviceTrait <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface RoutingAdviceTrait extends AdviceTrait {
    @ExceptionHandler
    default ResponseEntity<Problem> handleMissingServletRequestParameter(
            final MissingServletRequestParameterException exception,
            final NativeWebRequest request) {
        return create(HttpStatus.BAD_REQUEST, exception, request);
    }
    @ExceptionHandler
    default ResponseEntity<Problem> handleMissingServletRequestPart(
            final MissingServletRequestPartException exception,
            final NativeWebRequest request) {
        return create(HttpStatus.BAD_REQUEST, exception, request);
    }
    @ExceptionHandler
    default ResponseEntity<Problem> handleNoHandlerFound(
            final NoHandlerFoundException exception,
            final NativeWebRequest request) {
        return create(HttpStatus.NOT_FOUND, exception, request);
    }
    @ExceptionHandler
    default ResponseEntity<Problem> handleServletRequestBinding(
            final ServletRequestBindingException exception,
            final NativeWebRequest request) {
        return create(HttpStatus.BAD_REQUEST, exception, request);
    }

}
