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

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > 9) {
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
        if (currentNumber < 9) {
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
        currentNumber = 9;
    }
}
