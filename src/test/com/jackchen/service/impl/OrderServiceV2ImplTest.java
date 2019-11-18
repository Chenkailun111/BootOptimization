package com.jackchen.service.impl;

import com.jackchen.MyApplication;
import com.jackchen.model.OrderDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyApplication.class})
public class OrderServiceV2ImplTest {

    @Autowired
    private OrderServiceV2Impl orderService;

    @Test
    public void handle(){
        OrderDTO dto = new OrderDTO();
        dto.setType("4");
        String result = orderService.handle(dto);
        System.out.println(result);
    }
}