package com.demo.dao;

import com.demo.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * Create by XiaoBai on 2020/1/5.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId , @Param("userPhone") long userPhone,@Param("creatTime") Date creatTime);

    /**
     * 根据id查询Successkilled并携带秒杀对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId ,@Param("userPhone") long userPhone);

}
