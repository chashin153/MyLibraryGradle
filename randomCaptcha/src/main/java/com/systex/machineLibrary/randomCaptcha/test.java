package com.systex.machineLibrary.randomCaptcha;

import com.systex.machineLibrary.randomCaptcha.ranCaptcha;
public class test {

    public static void main(String[] args){
        String captcha = ranCaptcha.generateCaptcha();
        System.out.println(captcha);
    }
}
