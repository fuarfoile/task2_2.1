/*
 * TextEditor.java 28/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.textEditor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {

    public static StringBuilder getText() {
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

    public static void showAllFinds(StringBuilder text, String searchPattern) {
        Pattern pattern = Pattern.compile(searchPattern);
        Matcher matcher = pattern.matcher(text);
        boolean findFlag = false;

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
            findFlag = true;
        }

        if (!findFlag) {
            System.out.println("No matches");
        }
    }
}