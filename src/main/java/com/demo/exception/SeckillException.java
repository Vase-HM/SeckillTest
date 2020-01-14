package com.demo.exception;

/**
 * Create by XiaoBai on 2020/1/6.
 * @author XiaoBai
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
