package com.jackchen.handler.biz;

import com.jackchen.handler.AbstractHandler;
import com.jackchen.handler.HandlerType;
import com.jackchen.model.OrderDTO;
import org.springframework.stereotype.Component;

@Component
@HandlerType("4")
public class MyHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "以我的方式处理订单";
    }
}
