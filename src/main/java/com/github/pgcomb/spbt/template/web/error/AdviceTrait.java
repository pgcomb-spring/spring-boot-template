package com.github.pgcomb.spbt.template.web.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Title: AdviceTrait <br>
 * Description: AdviceTrait <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public interface AdviceTrait {

    default ResponseEntity<Problem> create(Throwable throwable, NativeWebRequest request){
        return ResponseEntity.ok().build();
    }
    default ResponseEntity<Problem> create(HttpStatus status, Throwable throwable, NativeWebRequest request){
        return ResponseEntity.ok().build();
    }
}
