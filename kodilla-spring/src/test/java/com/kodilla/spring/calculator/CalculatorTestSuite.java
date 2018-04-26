package com.kodilla.spring.calculator;

import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        final ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2.2, 3.3);
        double subResult = calculator.sub(5.2, 3);
        double mulResult = calculator.mul(3, 5);
        double divResult = calculator.div(50, 10);

        //Then
        Assert.assertEquals(addResult, 5.5, 0);
        Assert.assertEquals(subResult, 2.2, 0);
        Assert.assertEquals(mulResult, 15, 0);
        Assert.assertEquals(divResult, 5, 0);
    }
}
