public class Radio {
    private int radio;
    private int volume;
    private int radioStationNumber;
    private int next;
    private int prev;
    private int volumeHigher;
    private int volumeLower;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        this.radioStationNumber = radioStationNumber;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getVolumeHigher() {
        return volumeHigher;
    }

    public void setVolumeHigher(int volumeHigher) {
        this.volumeHigher = volumeHigher;
    }

    public int getVolumeLower() {
        return volumeLower;
    }

    public void setVolumeLower(int volumeLower) {
        this.volumeLower = volumeLower;
    }
}
