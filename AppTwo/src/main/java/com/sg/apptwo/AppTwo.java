/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.apptwo;

/**
 *
 * @author apprentice
 */
public class AppTwo {
      public static void main(String[] args) {

        String needle = "Alice";
        String haystack = "\"Perhaps it doesn't understand English,\" thought Alice. \"I dare say it's "
                + "a French mouse, come over with William the Conqueror.\" So she began "
                + "again: \"Où est ma chatte?\" which was the first sentence in her French "
                + "lesson-book. The Mouse gave a sudden leap out of the water and seemed to "
                + "quiver all over with fright. \"Oh, I beg your pardon!\" cried Alice "
                + "hastily, afraid that she had hurt the poor animal's feelings. \"I quite "
                + "forgot you didn't like cats.\"";

        int index = -1;
        boolean matches;

        for (int i = 0; i < haystack.length() - needle.length() && index < 0; i++) {

            matches = true;

            for (int j = 0; j < needle.length() && matches; j++) {
                matches = haystack.charAt(i + j) == needle.charAt(j);
            }

            if (matches) {
                index = i;
            }
        }

        System.out.println("Result: " + index);
    }

}
