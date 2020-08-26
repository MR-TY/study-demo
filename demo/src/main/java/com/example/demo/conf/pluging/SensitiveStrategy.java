package com.example.demo.conf.pluging;

import java.util.function.Function;

/**
 * @author tangyu
 * @date 2020-08-14 11:39
 */
public enum SensitiveStrategy {

    DRIVER_NAME(s -> s.replaceAll("(\\S)\\S(\\S*)", "$1*$2")),

    IDENTITY_CARD_NO(s -> s.replaceAll("(\\d{4})\\d{10}(\\w{4})", "$1****$2")),

    MOBILE_PHONE(s -> s.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2"));

    private final Function<String, String> desensitizer;

    SensitiveStrategy(Function<String, String> desensitizer) {
        this.desensitizer = desensitizer;
    }

    public Function<String, String> getDesensitizer() {
        return desensitizer;
    }

}
