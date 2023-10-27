package ru.netologi.services;

public class Radio {
    private int currentVolume;
    private int currentNumber;

    public int getCurrentNumber() {

        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    private int Numbers; // количество радиостанций

    public Radio(int size) {
        Numbers = size;
    }

    public Radio() {
        Numbers = 10;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > Numbers - 1) {
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
        if (currentNumber < Numbers - 1) {
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
        currentNumber = Numbers - 1;
    }
}
