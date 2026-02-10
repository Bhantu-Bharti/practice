package com.example.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NTTDATAApplication {
    public static void main(String[] args) {
        String str = "[{()}]";

        if(isBalancedExpression(str)){
            System.out.println("Balanced");
        }else {
            System.out.println("Unbalanced");
        }


    }

    private static Boolean isBalancedExpression(String exp) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < exp.length(); i++) {
            char bracket = exp.charAt(i);
            if (bracket == '[' || bracket == '{' || bracket == '(') {
                stack.push(bracket);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }

            char check;

            switch (bracket) {
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(') {
                        return false;
                    }
                    break;
                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{') {
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();
    }
}
