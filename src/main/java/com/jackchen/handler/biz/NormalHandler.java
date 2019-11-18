package com.jackchen.handler.biz;


import com.jackchen.handler.AbstractHandler;
import com.jackchen.handler.HandlerType;
import com.jackchen.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @Author: CipherCui
 * @Description: 普通订单处理器
 * @Date: Created in 10:17 2019/2/2
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }

}
