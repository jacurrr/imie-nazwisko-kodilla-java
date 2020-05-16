package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd(){
        //Given
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(2.05,1.95);
        double resultSub = calculator.sub(5,2);
        double resultMul = calculator.mul(4,6);
        double resultDiv = calculator.div(10,2);
        //Then
        Assert.assertEquals(4, resultAdd, 0.0001);
        Assert.assertEquals(3, resultSub, 0.0001);
        Assert.assertEquals(24, resultMul, 0.0001);
        Assert.assertEquals(5, resultDiv, 0.0001);
    }
}
