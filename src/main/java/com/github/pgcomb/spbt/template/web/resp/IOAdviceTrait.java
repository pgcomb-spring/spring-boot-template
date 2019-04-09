package com.github.pgcomb.spbt.template.web.resp;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartException;

/**
 * Title: IOAdviceTrait <br>
 * Description: IOAdviceTrait <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface IOAdviceTrait extends AdviceTrait {
    @ExceptionHandler
    default ResponseEntity<Problem> handleThrowable(final HttpMessageNotReadableException e,
                                                    final NativeWebRequest request) {
        return create(e, request);
    }
    @ExceptionHandler
    default ResponseEntity<Problem> handleThrowable(final MultipartException e,
                                                    final NativeWebRequest request) {
        return create(e, request);
    }
}
