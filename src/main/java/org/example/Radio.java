package org.example;

public class Radio {
    public int radioStationNumber;
    public int volume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }

        if (newRadioStationNumber < 0) {
            return;
        }

        radioStationNumber = newRadioStationNumber;
    }

    public void setStationToMax() {
        radioStationNumber = 9;
    }

    public void setStationToMin() {
        radioStationNumber = 0;
    }

    public void nextStation() {
        if (radioStationNumber < 9)
            radioStationNumber = radioStationNumber + 1;
        setRadioStationNumber(0);
    }

    public void prevStation() {
        if (radioStationNumber > 0)
            radioStationNumber = radioStationNumber - 1;
        setRadioStationNumber(9);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void setVolumeToMax() {
        volume = 100;
    }

    public void setVolumeToMin() {
        volume = 0;
    }

    public void volumeMoreThanMax() {
        if (volume < 100) {
            volume = volume + 1;
            setVolume(0);
        }
    }

        public void volumeLowerThanZero () {
            if (volume > 0) ;
            volume = volume - 1;
            setVolume(100);
        }
    }