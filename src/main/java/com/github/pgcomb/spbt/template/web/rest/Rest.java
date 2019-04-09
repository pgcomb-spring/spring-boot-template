package com.github.pgcomb.spbt.template.web.rest;

import com.github.pgcomb.spbt.template.config.HttpCodeSource;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Title: Rest <br>
 * Description: Rest <br>
 * Date: 2019年04月04日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
@RestController
public class Rest {

    @GetMapping("a")
    public String a() throws AuthenticationException {
        throw new BadCredentialsException("bad");
    }

}
