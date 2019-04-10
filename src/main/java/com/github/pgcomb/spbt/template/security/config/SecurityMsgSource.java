package com.github.pgcomb.spbt.template.security.config;

import com.github.pgcomb.spbt.template.config.MsgSourceAccessor;
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
public class SecurityMsgSource extends ResourceBundleMessageSource {

    private static MsgSourceAccessor msgSourceAccessor;

    public SecurityMsgSource() {
        setBeanClassLoader(this.getClass().getClassLoader());
        setBasename("messages/security/messages");
    }

    public static MsgSourceAccessor getAccessor(){
        if (msgSourceAccessor == null){
            msgSourceAccessor = new MsgSourceAccessor(new SecurityMsgSource(),null);
        }
        return msgSourceAccessor;
    }
}
