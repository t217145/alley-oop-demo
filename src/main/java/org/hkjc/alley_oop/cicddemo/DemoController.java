package org.hkjc.alley_oop.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping({"","/", "/index"})
    public DemoResponse index() {
        return new DemoResponse("Welcome to Alley OOP", "DEMO-001");
    }
}