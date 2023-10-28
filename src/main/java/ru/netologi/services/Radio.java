package ru.netologi.services;

public class Radio {
    private int currentVolume;
    private int currentNumber;
    private int numbers; // количество радиостанций

    public Radio(int size) {
        numbers = size;
    }

    public Radio() {
        numbers = 10;
    }

    public int getCurrentNumber() {

        return currentNumber;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > numbers - 1) {
            return;
        }
        if (newCurrentNumber < 0) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void nextNumber() {
        if (currentNumber < numbers - 1) {
            currentNumber++;
            return;
        }
        currentNumber = 0;
    }

    public void prevNumber() {
        if (currentNumber > 0) {
            currentNumber--;
            return;
        }
        currentNumber = numbers - 1;
    }
}
