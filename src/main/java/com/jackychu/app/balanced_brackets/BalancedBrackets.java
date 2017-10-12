package com.jackychu.app.balanced_brackets;

import java.util.HashMap;
import java.util.Map;

/**
 * You have a string with different type of brackets inside. Ex. '(1+2)*[6, 7, 9](){}'.
 * Write a program which returns True if string is balanced (each opening bracket has closing one) or not.
 * Closing brackets should go only after opening. This string: '{})(' is not balanced.
 * 
 */
public class BalancedBrackets {
    /**
     * Check the input string is brackets balanced or not
     * @param str The string to check
     * @return true - if string is brackets balanced, else false.
     */
    public static boolean isBalanced(String str) {
        Map<Character, Integer> brackets = new HashMap<Character, Integer>();
        brackets.put('(', 0);
        brackets.put('[', 0);
        brackets.put('{', 0);

        int count;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '(':
                    count = brackets.get('(');
                    brackets.put('(', count+1);
                    break;
                case ')':
                    count = brackets.get('(');
                    count--;
                    if (count < 0) return false;
                    brackets.put('(', count);
                    break;
                case '[':
                    count = brackets.get('[');
                    brackets.put('[', count+1);
                    break;
                case ']':
                    count = brackets.get('[');
                    count--;
                    if (count < 0) return false;
                    brackets.put('[', count);
                    break;
                case '{':
                    count = brackets.get('{');
                    brackets.put('{', count+1);
                    break;
                case '}':
                    count = brackets.get('{');
                    count--;
                    if (count < 0) return false;
                    brackets.put('{', count);
                    break;
            }
        }

        if (brackets.get('(') != 0) return false;
        if (brackets.get('[') != 0) return false;
        if (brackets.get('{') != 0) return false;

        return true;
    }
}
