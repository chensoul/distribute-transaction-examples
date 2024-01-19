package com.chensoul.distribute.transaction.controller;

import com.chensoul.distribute.transaction.service.PaymentServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class PaymentController {
    @Autowired
    private PaymentServcie paymentServcie;

    @RequestMapping("payment")
    public String payment(int userId, int orderId, BigDecimal amount) throws Exception {

        int result = paymentServcie.pamentMQ(userId, orderId, amount);

        return "支付结果："+result;
    }
}
