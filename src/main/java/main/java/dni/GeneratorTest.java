package main.java.dni;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vk on 26.02.16.
 */
public class GeneratorTest {

    @Test
    public void testGenerate() throws Exception {
        Generator generator = new Generator();
        String generate = generator.generate();
        Validator validator = new Validator();
        assertEquals(true, validator.validate(generate));
    }
}