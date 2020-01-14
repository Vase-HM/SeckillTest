package com.demo.exception;

/**
 * 秒杀关闭异常
 * Create by XiaoBai on 2020/1/6.
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
