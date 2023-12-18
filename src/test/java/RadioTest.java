import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetMaxRadioStationNumber() {
        Radio radio = new Radio();

        radio.setStationToMax();

        int expected = 9;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinRadioStationNumber() {
        Radio radio = new Radio();

        radio.setStationToMin();

        int expected = 0;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetManuallySetStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNextStation() {
        Radio radio = new Radio();

        radio.nextStation();
        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStation1() {
        Radio radio = new Radio();

        radio.nextStation();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStationZero() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStationNine() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPreviousStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPrevStationNine() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStation8() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPrev9Station() {
        Radio radio = new Radio();

        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPrevStationBeforeTen() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeSetManually() {
        Radio volume = new Radio();

        volume.setVolume(20);

        int expected = 20;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeMoreThanMax() {
        Radio volume = new Radio();

        volume.setVolume(100);
        volume.volumeMoreThanMax();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNextVolume() {
        Radio volume = new Radio();

        volume.setVolume(99);
        volume.volumeMoreThanMax();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolume1() {
        Radio volume = new Radio();

        volume.setVolume(0);
        volume.volumeMoreThanMax();

        int expected = 1;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolume100() {
        Radio volume = new Radio();

        volume.setVolume(0);
        volume.volumeLowerThanZero();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeOneHundred() {
        Radio volume = new Radio();

        volume.volumeLowerThanZero();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn100Volume() {
        Radio volume = new Radio();

        volume.setVolume(101);
        volume.volumeLowerThanZero();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolume99() {
        Radio volume = new Radio();

        volume.setVolume(100);
        volume.volumeLowerThanZero();

        int expected = 99;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeBeforeMinusOne() {
        Radio volume = new Radio();

        volume.setVolume(-1);
        volume.volumeLowerThanZero();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
