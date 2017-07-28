/*
 * TextEditor.java 28/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.textEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {
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
