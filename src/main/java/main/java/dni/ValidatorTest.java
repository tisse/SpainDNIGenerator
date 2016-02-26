package main.java.dni;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vk on 26.02.16.
 */
public class ValidatorTest {

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testValidate() throws Exception {
        String[] dnis = {"37232296B", "74522312N", "82472467X", "59349212N", "93359908X", "42267389J", "80680455C", "13242108L", "15125960X", "56701472D", "56701472C"};
        Validator validator = new Validator();
        for (String dni : dnis) {
            boolean validate = validator.validate(dni);
            System.out.println(dni + ":" + validate);
            assertEquals(true, validate);
        }

    }
}