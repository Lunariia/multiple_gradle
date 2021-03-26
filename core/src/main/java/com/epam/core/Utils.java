package com.epam.core;

import com.epam.utils.StringUtils;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        for (String number : str) {
            if (!stringUtils.isPositiveNumber(number)) {
                return false;
            }
        }
        return true;
    }

}
