package org.firstinspires.ftc.teamcode;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        front22(String string);
        public String front22 (String str){
            String string2 = new String();
            string2 = str + str.substring(0, 1) + str.substring(1, 2);
            return string2;
        }
    }
}