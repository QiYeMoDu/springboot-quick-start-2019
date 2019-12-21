package com.qiyemodu.springbootquickstart2019;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来测试新建springboot项目是否正常
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@RestController
public class StartTest {
    @GetMapping("/startTest")
    public String ststartTest(){
        return "I am ok";
    }
}
