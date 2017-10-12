package com.jackychu.app.balanced_brackets;

import junit.framework.TestCase;

public class BalancedBracketsTest extends TestCase {
    public void testIsBalanced() throws Exception {
        String str = "(1+2)*[6, 7, 9](){}";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertTrue(balanced);
    }

    public void testIsBalanced2() throws Exception {
        String str = "";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertTrue(balanced);
    }

    public void testIsBalanced3() throws Exception {
        String str = "(";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced4() throws Exception {
        String str = "(}";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced5() throws Exception {
        String str = "(()";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced6() throws Exception {
        String str = ")(";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced7() throws Exception {
        String str = "())";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced8() throws Exception {
        String str = "[";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced9() throws Exception {
        String str = "[}";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced10() throws Exception {
        String str = "[[]";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced11() throws Exception {
        String str = "][";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced12() throws Exception {
        String str = "[]]";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced13() throws Exception {
        String str = "{";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced14() throws Exception {
        String str = "{)";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced15() throws Exception {
        String str = "{{}";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced16() throws Exception {
        String str = "}{";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced17() throws Exception {
        String str = "{}}";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced18() throws Exception {
        String str = ")";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced19() throws Exception {
        String str = "]";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced20() throws Exception {
        String str = "}";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertFalse(balanced);
    }

    public void testIsBalanced21() throws Exception {
        String str = "1234567890abcdefg";
        boolean balanced = BalancedBrackets.isBalanced(str);

        assertTrue(balanced);
    }

}