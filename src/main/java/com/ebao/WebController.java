package com.ebao;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WebController {
    @RequestMapping("/")
    public String home() {
        return "Hello from eBao team";
    }

    @RequestMapping("/guess/{number}")
    public String sum(@PathVariable("number") int number) {
        Random random=new Random(System.currentTimeMillis());
        int r=random.nextInt(10);

        if(number==r){
            return "Yeah, you got it";
        }

        return String.format("You number is %d, and result is %d.  Please guess a number between 1 and 10. ",number,r);
    }

}
