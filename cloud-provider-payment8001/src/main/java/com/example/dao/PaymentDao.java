package com.example.dao;

import com.example.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @ClassName PaymentDao
 * @Description TODO
 * @Author tongx
 * @Date 2022/11/2 11:02
 * @Version 1.0
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
