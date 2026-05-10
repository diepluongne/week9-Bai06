package com.lab;

import com.lab.mathutils.MathUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Điểm vào demo — giáo viên chạy ./run.sh (Maven verify); có thể chạy thêm main qua exec nếu cần.
 */
public final class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private Main() {
    }

    public static void main(String[] args) {
        log.info("MathUtils demo: max(3,7)={}", MathUtils.max(3, 7));
        log.info("MathUtils demo: divide(12,3)={}", MathUtils.divide(12, 3));
    }
}
