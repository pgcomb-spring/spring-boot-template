package com.github.pgcomb.spbt.template.exceptionhandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pgcomb.spbt.template.web.resp.Problem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractExceptionRespHandler<E extends Throwable> implements ExceptionRespHandler<E> {

    private static final Logger log = LoggerFactory.getLogger(AbstractExceptionRespHandler.class);

    private Integer code;
    private String msg;
    private HttpStatus httpStatus;

    private ObjectMapper objectMapper = new ObjectMapper();

    public AbstractExceptionRespHandler(Integer code, String msg, HttpStatus httpStatus) {
        this.code = code;
        this.msg = msg;
        this.httpStatus = httpStatus;
    }
    public AbstractExceptionRespHandler(Integer code, HttpStatus httpStatus) {
        this.code = code;
        this.httpStatus = httpStatus;
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, E ex) throws IOException {
        log.warn("请求异常:exception({}),message({}):", ex.getClass(), ex.getMessage());
        Problem problem = new Problem();
        problem.code(code);
        problem.message(msg == null ? ex.getMessage() : msg);
        response.setStatus(httpStatus.value());
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        response.getOutputStream().write(objectMapper.writeValueAsBytes(problem));
    }
}
