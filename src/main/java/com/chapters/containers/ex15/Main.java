package com.chapters.containers.ex15;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        char[] letters = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == '-') {
                System.out.print(stack.pop());
            } else if (letters[i] == '+') {
                stack.push(letters[i+1]);
            }
        }
        System.out.println();
    }

    // res:
    // cnUtreaiytn ursel

}
