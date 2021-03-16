package com.gordondickens.javaseven;



/**
 *
 * @author Michel Graciano <michel.graciano at gmail dot com>
 */
public class StringInSwitch {
    public void test() {
        final String str = "str";

        if ("abc".equals(str)) {
            System.out.println("ABC");
        } else if ("def".equals(str)) {
            System.out.println("DEF");
        }
    }
}
