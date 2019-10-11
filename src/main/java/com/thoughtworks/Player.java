package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

class Player {

    private ArrayList<Integer> madeMoves = new ArrayList<>();

    void move(int newPosition) {
        madeMoves.add(newPosition);
    }

    boolean alreadyMadeMove(int positionPlayedAt) {
        return madeMoves.contains(positionPlayedAt);
    }

    boolean doesContain(List<List<Integer>> someMoves) {
        return someMoves.contains(madeMoves);
    }

}
