package com.lab.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tiện ích toán học — log có cấu trúc thay cho in thủ công.
 */
public final class MathUtils {

    private static final Logger log = LoggerFactory.getLogger(MathUtils.class);

    private MathUtils() {
    }

    public static int max(int a, int b) {
        log.debug("max({}, {})", a, b);
        return a >= b ? a : b;
    }

    public static int divide(int dividend, int divisor) {
        log.info("Chia {} cho {}", dividend, divisor);
        if (divisor == 0) {
            log.error("Chia cho 0: dividend={}", dividend);
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return dividend / divisor;
    }
}
