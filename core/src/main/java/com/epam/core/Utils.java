package com.epam.core;

import com.epam.utils.StringUtils;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        for (String number : str) {
            if (!StringUtils.isPositiveNumber(number)) {
                return false;
            }
        }
        return true;
    }

}
