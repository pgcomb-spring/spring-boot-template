package com.github.pgcomb.spbt.template.web.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Title: GeneralAdviceTrait <br>
 * Description: GeneralAdviceTrait <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface GeneralAdviceTrait extends AdviceTrait{
    @ExceptionHandler
    default ResponseEntity<Problem> handleThrowable(final Throwable throwable, final NativeWebRequest request) {
        return create(throwable, request);
    }
}
