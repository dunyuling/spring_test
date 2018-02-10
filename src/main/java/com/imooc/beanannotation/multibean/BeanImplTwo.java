package com.imooc.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class BeanImplTwo implements BeanInterface {

    @Autowired
    BeanImplOne beanImplOne;
}
