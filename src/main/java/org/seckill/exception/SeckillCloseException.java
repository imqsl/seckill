package org.seckill.exception;

import org.seckill.dto.SeckillExecution;
import org.seckill.entity.SuccessKilled;

/**
 * Created by imqsl on 2017/7/19.
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
