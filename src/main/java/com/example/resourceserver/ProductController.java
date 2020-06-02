package com.example.resourceserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping(value = "/products")
    public String[] getProductName() {
        return new String[]{"Honey", "Message 2"};
    }


}
