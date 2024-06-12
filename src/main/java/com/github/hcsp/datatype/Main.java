package com.github.hcsp.datatype;

public class Main {
    // 我们希望实现一个除法，但是这里的结果有明显的错误
    // 例如 3/2 == 1.0
    // 请修复此问题，让3/2的结果为正确的1.5
    // 不要修改方法的参数类型
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("3/2=" + divide(3, 2));
    }
}
