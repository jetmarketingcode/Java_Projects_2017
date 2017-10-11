/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.chessboard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ChessBoard {

    public static void main(String[] args) throws Exception {

            write(" X X X X X X X X\n X X X X X X X X\n O O O O O O O O\n O O O O O O O O");
    }

    static void write(String whatEver) throws Exception {
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
        out.println(whatEver);
        out.flush();
        out.close();
    }

    static void read() throws Exception {
        Scanner inputReader = new Scanner(new BufferedReader(new FileReader("out.txt")));
        while (inputReader.hasNextLine()) {
            String currentLine = inputReader.nextLine();
            System.out.println(currentLine);

        }
    }
}
