/*
 * Main.java 28/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task2;

import com.boast.textEditor.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder text = getText();

        TextEditor.showAllFinds(text, "(\\+\\d+)\\$%(\\+\\d+)");
    }

    private static StringBuilder getText() {
        Scanner in = new Scanner(System.in);

        System.out.println("Type a text: (double enter to finish)");
        String strLine = in.nextLine();

        StringBuilder text = new StringBuilder(strLine);

        do {
            strLine = in.nextLine();
            if(strLine.length() > 0) {
                text = new StringBuilder(text + "\n" + strLine);
            }
        } while (strLine.length() > 0);

        return text;
    }
}