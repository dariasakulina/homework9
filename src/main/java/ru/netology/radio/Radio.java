package ru.netology.radio;

public class Radio {
    private int minVolume;
    private int maxVolume;
    private int currentVolume = minVolume;
    private int minStation;
    private int maxStation;
    private int currentStation = minStation;

    public Radio() {
        minVolume = 0;
        maxVolume = 100;
        minStation = 0;
        maxStation = 9;
    }

    public Radio(int amountStations) {
        maxStation = amountStations - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 0) {
            currentVolume = minVolume;
            return;
        }
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = minVolume;
            return;
        }
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = minVolume;
        }
        if (currentVolume > 100) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        if (currentStation < maxStation) {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }
}