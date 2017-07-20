package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * Created by imqsl on 2017/7/19.
 */
public interface SeckillService {
    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);

    //秒杀开启时输出秒杀接口地址，
    // 否则输出系统时间和开启时间
    Exposer exportSeckillUrl(long seckillId);

    //执行秒杀操作
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)

    throws SeckillException,RepeatKillException,SeckillCloseException;
}
