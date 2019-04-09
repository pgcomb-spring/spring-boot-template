package com.github.pgcomb.spbt.template.web.resp;

import java.util.HashMap;

/**
 * Title: Problem <br>
 * Description: Problem <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
public class Problem extends HashMap<String,Object> {

    private static String CODE_NAME = "code";
    private static String MESSAGE_NAME = "message";
    private static String DATA_NAME = "data";

    public void code(Integer code){
        put(CODE_NAME,code);
    }
    public void message(String message){
        put(MESSAGE_NAME,message);
    }
    public void data(Object data){
        put(DATA_NAME,data);
    }
}
