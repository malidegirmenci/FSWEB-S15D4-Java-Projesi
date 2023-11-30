package com.workintech.StackAndQueue;

import java.util.*;

public class Palindrome {
    private String sentence;

    public Palindrome(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    private void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void makeCheckable() {
        setSentence(getSentence().replaceAll("[.,?!']", ""));
        setSentence(getSentence().replaceAll(" ", ""));
        setSentence(getSentence().toLowerCase());
        System.out.print(getSentence() + " -> ");
    }

    public Stack<Character> convertStack() {
        Stack<Character> stock = new Stack<>();
        for (int i = 0; i < getSentence().length(); i++) {
            stock.push(getSentence().charAt(i));
        }
        return stock;
    }

    public boolean compareLetterWithStack() {
        Stack<Character> letters = convertStack();

        int firstIdx = 0;
        while (firstIdx < getSentence().length() - 1) {
            if (!(letters.pop().equals(getSentence().charAt(firstIdx++)))) {
                return false;
            }
        }
        return true;

    }

    public Queue<Character> convertQueue() {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < getSentence().length(); i++) {
            queue.offer(getSentence().charAt(i));

        }
        return queue;
    }

    public boolean compareLetterWithQueue() {
        Queue<Character> letters = convertQueue();
        int lastIdx = getSentence().length() - 1;
        while (0 <= lastIdx) {
            if (!(letters.poll().equals(getSentence().charAt(lastIdx--)))) {
                return false;
            }
        }
        return true;
    }
}
