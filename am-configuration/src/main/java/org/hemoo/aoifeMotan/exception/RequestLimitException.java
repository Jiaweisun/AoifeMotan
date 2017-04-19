package org.hemoo.aoifeMotan.exception;

/**
 * 为了捕获请求受限抛出的异常
 * Created by sunjiawei on 2017/4/13.
 */
public class RequestLimitException extends Exception {

    private static final long serialVersionUID = 1364225358754654702L;

    public RequestLimitException() {
        super("HTTP请求超出设定的限制");
    }

    public RequestLimitException(String message) {
        super(message);
    }
}
