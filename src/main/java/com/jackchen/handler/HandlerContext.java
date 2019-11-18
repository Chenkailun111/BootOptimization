package com.jackchen.handler;


import com.jackchen.util.BeanTool;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author: CipherCui
 * @Description: 处理器上下文，根据类型获取相应的处理器
 * @Date: Created in 10:07 2019/2/2
 */

@SuppressWarnings("unchecked")
public class HandlerContext {

    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {
        System.out.println("handlerMap的结果"+handlerMap);
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }

}
