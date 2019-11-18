package com.jackchen.service.impl;


import com.jackchen.handler.AbstractHandler;
import com.jackchen.handler.HandlerContext;
import com.jackchen.model.OrderDTO;
import com.jackchen.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: CipherCui
 * @Description:
 * @Date: Created in 9:54 2019/2/2
 */
@Service
public class OrderServiceV2Impl implements IOrderService {

    @Resource
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        System.out.println("handlerContext是否"+handlerContext);
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }
}
