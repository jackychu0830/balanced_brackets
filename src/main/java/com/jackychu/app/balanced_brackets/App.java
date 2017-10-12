package com.jackychu.app.balanced_brackets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean balanced = BalancedBrackets.isBalanced(args[0]);
        if (balanced) {
            System.out.printf("The brackets in string %s are balanced%n", args[0]);
        } else {
            System.out.printf("The brackets in string %s are not balanced%n", args[0]);
        }

    }
}
