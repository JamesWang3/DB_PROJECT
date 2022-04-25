package com.hqz.wow.service;

import com.hqz.wow.entity.PaymentEntity;
import com.hqz.wow.mapper.PaymentMapper;
import com.hqz.wow.vo.PaymentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentMapper paymentMapper;

    @Override
    public PaymentEntity getPaymentRecordById(int paymentId) {
        return paymentMapper.selectById(paymentId);
    }

    @Override
    @Transactional
    public void payBill(PaymentVO paymentVO) {
        PaymentEntity paymentRecord = new PaymentEntity();
        BeanUtils.copyProperties(paymentVO, paymentRecord);
        paymentMapper.insert(paymentRecord);
    }
}
