package main.java.dni;

import org.apache.commons.lang3.RandomStringUtils;

import static main.java.dni.Constants.LETTERS;

public class Generator {

    public static void main(String[] args) {
        String generate = new Generator().generate();
        System.out.println(generate);
        Validator validator = new Validator();
        System.out.println(validator.validate(generate));
    }


    public String generate(){
        String randomNumeric = RandomStringUtils.randomNumeric(8);
        int x = Integer.parseInt(randomNumeric);
        int idx = x % 23;
        char charAt = LETTERS.charAt(idx);

        return randomNumeric+charAt;

    }


}
