package com.lab.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void maxReturnsGreater() {
        assertEquals(7, MathUtils.max(3, 7));
        assertEquals(5, MathUtils.max(5, 5));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(1, 0));
    }

    @Test
    void divideOk() {
        assertEquals(4, MathUtils.divide(12, 3));
    }
}
