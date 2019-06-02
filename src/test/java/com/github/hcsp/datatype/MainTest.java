package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() throws NoSuchMethodException {
        assertTrue(Math.abs(1d / 3d - Main.divide(1, 3)) < 1e-5);
        assertTrue(Math.abs(1d / 2d - Main.divide(1, 2)) < 1e-5);
        Main.class.getDeclaredMethod("divide", int.class, int.class);
    }
}
