package com.jcalzateb;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
    private final Calculator calculator=new Calculator();

    @Test
    public void testSum(){
        int result=calculator.sum(2,3);
        assertThat(result, is(equalTo(5)));
    }
    @Test
    public void testSubtract(){
        int result=calculator.subtract(3, 2);
        assertThat(result, is(equalTo(1)));
    }
    @Test
    public void testMulti(){
        int result=calculator.multi(5, 3);
        assertThat(result, is(equalTo(15)));
    }
    @Test
    public void testdiiv(){
        int result=calculator.div(10, 5);
        assertThat(result, is(equalTo(2)));
    }
}
