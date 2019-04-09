package com.github.pgcomb.spbt.template.config;

import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Title: HttpCodeSource <br>
 * Description: HttpCodeSource <br>
 * Date: 2019年04月09日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public class HttpCodeSource extends ResourceBundleMessageSource {

    private static MsgSourceAccessor msgSourceAccessor;

    public HttpCodeSource() {
        setBeanClassLoader(this.getClass().getClassLoader());
        setBasename("messages/httpcode");
    }

    public static MsgSourceAccessor getAccessor(){
        if (msgSourceAccessor == null){
            msgSourceAccessor = new MsgSourceAccessor(new HttpCodeSource(),null);
        }
        return msgSourceAccessor;
    }
}
