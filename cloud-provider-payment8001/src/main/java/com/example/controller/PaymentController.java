package com.example.controller;

import com.example.entities.CommonResult;
import com.example.entities.Payment;
import com.example.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author tongx
 * @Date 2022/11/2 11:22
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("payment/create")
    public CommonResult create(Payment payment){
        int i = paymentService.create(payment);
        log.info("插入结果"+i);
        if (i>0){
            return new CommonResult(200,"插入成功",i);
        }else {
            return new CommonResult(404,"插入失败");
        }
    }

    @GetMapping ("payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果"+paymentById);
        if (paymentById!=null){
            return new CommonResult(200,"成功",paymentById);
        }else {
            return new CommonResult(404,"没有对应记录，id="+id);
        }
    }
}
