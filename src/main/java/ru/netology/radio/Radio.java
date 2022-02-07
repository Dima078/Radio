package ru.netology.radio;

public class Radio {
    private int currentStation = 5;
    private int currentVolume = 50;
    private int numberStation = 10;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation < 0) || (currentStation > numberStation - 1)) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == numberStation - 1) {
            currentStation = 0;
        } else
            currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberStation - 1;
        } else
            currentStation--;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = 0;
            return;
        }
        if (currentVolume > 100) {
            this.currentVolume = 100;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }
}
