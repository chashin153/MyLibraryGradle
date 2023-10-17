package com.systex.machineLibrary.randomCaptcha;

import java.util.Random;

public class ranCaptcha {
    public static void main(String[] args){

    }
    public static String generateCaptcha() {
        //5位隨機碼
        char charr[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int x = 0; x < 5; ++x) {
            sb.append(charr[r.nextInt(charr.length)]);
        }
        return sb.toString();
    }
}
