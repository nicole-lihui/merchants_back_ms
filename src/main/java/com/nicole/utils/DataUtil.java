package com.nicole.utils;

import java.math.BigDecimal;

public class DataUtil {

    public static Double add(Double v1, BigDecimal v2) {
        BigDecimal b1=new BigDecimal(Double.toString(v1));
        return b1.add(v2).doubleValue();
    }
}
