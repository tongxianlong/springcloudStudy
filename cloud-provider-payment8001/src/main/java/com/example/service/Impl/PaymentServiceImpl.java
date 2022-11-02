package com.example.service.Impl;

import com.example.dao.PaymentDao;
import com.example.entities.Payment;
import com.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author tongx
 * @Date 2022/11/2 11:18
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
