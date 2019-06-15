package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() throws NoSuchMethodException {
        Assertions.assertTrue(Math.abs(1d / 3d - Main.divide(1, 3)) < 1e-5);
        Assertions.assertTrue(Math.abs(1d / 2d - Main.divide(1, 2)) < 1e-5);
        Main.class.getDeclaredMethod("divide", int.class, int.class);
    }
}
