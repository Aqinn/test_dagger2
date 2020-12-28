package com.aqinn.test_dagger2;

/**
 * @author Aqinn
 * @date 2020/12/28 12:33 PM
 */
public class CommonUtil {

    public static String getFormatLog(String where, String var, Object ref) {
        return String.format("%20s: %20s => %s", where, var, ref);
    }

}
