package com.ll;

public class Calc {

    public static int run(String expr) {
        if(expr.contains(" + ")) {
            String[] sBits = expr.split(" \\+ ");
            int num1 = Integer.parseInt(sBits[0]);
            int num2 = Integer.parseInt(sBits[1]);
            return num1 + num2;
        } else if (expr.contains(" * ")) {
            String[] sBits = expr.split(" \\* ");
            int num1 = Integer.parseInt(sBits[0]);
            int num2 = Integer.parseInt(sBits[1]);
            return num1 * num2;
        }
        return -1;
    }
}
