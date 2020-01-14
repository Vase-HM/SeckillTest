package com.demo.exception;

/**
 * 重复秒杀异常（运行期异常）
 * Create by XiaoBai on 2020/1/6.
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
