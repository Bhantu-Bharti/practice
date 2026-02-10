package com.example.demo.medium.web;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class App1 {
    public static void main(String[] args) {
        String str="javajaj";
        String s = str.chars()
                .filter(c->str.indexOf((char)c)==str.lastIndexOf((char)c))
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());

        System.out.println(s);
        // 738399-ntt ticket



        /*
            Question 13 : Given an expression string exp, write a program to examine whether the pairs and the
            orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

            Example:

                    Input: exp = “[()]{}{[()()]()}”
                    Output: Balanced
            Explanation: all the brackets are well-formed

                    Input: exp = “[(])”
                    Output: Not Balanced
            Explanation: 1 and 4 brackets are not balanced because
            there is a closing ‘]’ before the closing ‘(‘
        */

        /*String inputString = "[{()}]";//Need to check whether this string is balance parenthesis string
        System.out.println("Result:::" + isBalancedInput(inputString));*/


    }

    private static String isBalancedInput(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='[' || input.charAt(i)=='{' || input.charAt(i)=='('){
                stack.push(input.charAt(i));
            }

            if (input.charAt(i)==']' || input.charAt(i)=='}' || input.charAt(i)==')'){

            }
        }



        return null;
    }
}
