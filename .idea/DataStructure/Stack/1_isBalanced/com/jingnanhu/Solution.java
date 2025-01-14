package com.jingnanhu;
import java.util.*;

public class Solution {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            if (isBalanced(input)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
        sc.close();
    }


    public static boolean isBalanced (String input){
        Stack<Character> stack = new Stack<>();
        for(char c:input.toCharArray()){
            if (c == '{' || c == '(' || c == '['){
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']'){
                if (stack.isEmpty()||!isMatchingPair(stack.pop(), c))
                {
                    return false;
                }

            }
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }

    }
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
