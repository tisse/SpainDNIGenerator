package main.java.dni;

import org.apache.commons.lang3.StringUtils;
import static main.java.dni.Constants.LETTERS;


/**
 * Created by vk on 26.02.16.
 */
public class Validator {

    private static int len = 9;

    public boolean validate(String dni) {
        if (StringUtils.isEmpty(dni)) {
            return false;
        }
        if (dni.length() != len) {
            return false;
        }

        int x = Integer.parseInt(dni.substring(0, len - 1));
        int idx = x % 23;
        char charAt = LETTERS.charAt(idx);

        return charAt == dni.charAt(9 - 1);
    }

}
