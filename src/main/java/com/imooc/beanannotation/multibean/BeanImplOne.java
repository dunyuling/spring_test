package com.imooc.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class BeanImplOne implements BeanInterface {

    @Autowired
    BeanImplTwo beanImplTwo;
}
