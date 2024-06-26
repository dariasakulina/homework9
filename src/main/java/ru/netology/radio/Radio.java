package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        if (currentStation < 9) {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }
}