/*
 * Main.java 28/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task2;

import com.boast.textEditor.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder text = TextEditor.getText();

        TextEditor.showAllFinds(text, "(\\+\\d+)\\$%(\\+\\d+)");
    }
}