package org.personalProject.demo.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/sample")
public class SampleController {

    @GetMapping({"/exLayout1","/exLayout2"})
    public void exLayout1(){
        log.info("exLayout...........");
    }

    @GetMapping("/ex1")
    public void ex1(){
        log.info("ex01...............");
    }
}
