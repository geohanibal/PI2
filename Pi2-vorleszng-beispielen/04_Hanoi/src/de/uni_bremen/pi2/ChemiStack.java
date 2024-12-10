package de.uni_bremen.pi2;

import java.util.Stack;

public class ChemiStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(11);
        stack.push(13);
        stack.push(9);
        stack.add(15);

        System.out.println("ელემენტების რაოდენობა: " + stack.size());
        System.out.println("ბოლო ელემენტი ---> " + stack.peek());
        // Ein Element vom Stack entfernen თან შლის და თან გვაჩვენებს
        int entfernt = stack.pop();
        System.out.println("Entferntes Element: " + entfernt);

        System.out.println("Oბოლო ელემენტი --->  " + stack.peek());

        // Größe des Stacks
        System.out.println("ელემენტების რაოდენობა: " + stack.size());

        System.out.println(stack.search(13));

        System.out.println("=".repeat(stack.peek()));

    }
}
