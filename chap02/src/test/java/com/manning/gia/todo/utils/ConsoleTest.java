package com.manning.gia.todo.utils;

import org.junit.Test;

import java.io.Console;
import java.util.Scanner;

/**
 * @author jhs
 * @create 2017-05-16 15:26
 */
public class ConsoleTest {

    @Test
    public void testConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        String input = scanner.nextLine();
        System.out.println("input:"+input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        String input = scanner.nextLine();
        System.out.println("input:"+input);
    }
}