package com.github.pgcomb.spbt.template.web.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Title: HttpAdviceTrait <br>
 * Description: HttpAdviceTrait <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface HttpAdviceTrait extends AdviceTrait {

    @ExceptionHandler
    default ResponseEntity<Problem> handleThrowable(final HttpRequestMethodNotSupportedException e,
                                                    final NativeWebRequest request) {
        return create(e, request);
    }
    @ExceptionHandler
    default ResponseEntity<Problem> handleThrowable(final HttpMediaTypeNotAcceptableException e,
                                                    final NativeWebRequest request) {
        return create(e, request);
    }
    @ExceptionHandler
    default ResponseEntity<Problem> handleThrowable(final HttpMediaTypeNotSupportedException e,
                                                    final NativeWebRequest request) {
        return create(e, request);
    }

}
