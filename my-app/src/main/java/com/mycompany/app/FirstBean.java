package com.mycompany.app;

import org.springframework.stereotype.Component;
@Component
public class FirstBean {
    public FirstBean(PrototypeBean prototypeBean) {
        System.out.println("First bean was created");
        System.out.println("First prototype bean" + prototypeBean.toString() );
    }


}
