package com.mycompany.app;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {
    public SecondBean() {
        System.out.println("Second bean was created");
    }
}
