package cn.Test;

/**
 * @author 10237
 * @date 2021-02-24 12:08
 */
public class StrSample {
    public String simpleContactStr(char str1[], String str2) {
        try {
            return str1 + "+" + str2;
        } catch (Exception e) {
            System.out.println("catch exception.");
        } finally {
            System.out.println("finally block");
            /*
             * fnally 语句总是执行在try中的return语句前面
             */

        }
        return "";
    }

    public static void main(String[] args) {
        StrSample sample = new StrSample();
        System.out.println("连接串是: " + sample.simpleContactStr(null, "A"));
    }
}