package com.mycompany.app;

import org.springframework.stereotype.Component;
@Component
public class FirstBean {
    private SecondBean secondBean;
    public void setSecondBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }
    public FirstBean(PrototypeBean prototypeBean) {
        System.out.println("First bean was created");
        System.out.println("First prototype bean" + prototypeBean.toString() );
    }


}
