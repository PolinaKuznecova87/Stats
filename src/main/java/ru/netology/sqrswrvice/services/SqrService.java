package ru.netology.sqrswrvice.services;

public class SqrService {

    public int calculate(int min, int max) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square <= max) {
                if (square >= min) {
                    counter++;
                }


            }
        }
        return counter;
    }
}
