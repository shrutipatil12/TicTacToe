package com.thoughtworks;

import java.util.Scanner;

class Game {
    private Scanner sc = new Scanner(System.in);

    int playerInput() {
        System.out.println("Enter the moves");
        return sc.nextInt();
    }
}
