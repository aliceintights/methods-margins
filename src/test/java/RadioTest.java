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
    public void shouldReturnNextStation2() {
        Radio radio = new Radio();

        radio.nextStation();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

//        TEST
    }

    @Test
    public void shouldReturnMaxEqualMax() {
        Radio radio = new Radio();

        radio.maxStationEqualMax();
        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

//        TEST
    }

    @Test
    public void shouldReturnPreviousStation() {
        Radio radio = new Radio();

        radio.prevStation();
        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

//        TEST
    }

    @Test
    public void shouldReturnMinEqualMin() {
        Radio radio = new Radio();

        radio.minStationEqualMin();
//        radio.setRadioStationNumber(9);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

//        TEST
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

//    @Test
//    public void shouldReturnNextStation2() {
//        Radio radio = new Radio();
//
//        radio.nextStation2();
////        radio.setRadioStationNumber(11);
//
//        int expected = 11;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//
////        TEST
//    }

//    @Test
//    public void shouldReturnNextEqual() {
//        Radio radio = new Radio();
//
//        radio.nextStationEqualZero();
//        radio.setRadioStationNumber(0);
//
//        int expected = 0;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//
////        TEST
//    }

//    @Test
//    public void shouldReturnNextStation3() {
//        Radio radio = new Radio();
//
//        radio.nextStation();
//        radio.setRadioStationNumber(0);
//
//        int expected = 1;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//
////        TEST
//    }

//    @Test
//    public void shouldReturnPreviousStation() {
//        Radio radio = new Radio();
//
//        radio.prevStation();
//        radio.setRadioStationNumber(9);
//
//        int expected = 9;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void shouldReturnPreviousStation() {
//        Radio radio = new Radio();
//
//        radio.prevStation();
//        radio.setRadioStationNumber(9);
//
//        int expected = 9;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//
////        TEST
//    }
//    @Test
//    public void shouldReturnPreviousStation2() {
//        Radio radio = new Radio();
//
//        radio.prevStation();
//
//        int expected = 0;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//
////        TEST
////    }
//    @Test
//    public void shouldIncreaseStationNumber() {
//        Radio radio = new Radio();
//
//        radio.setRadioStationNumber(10);
//
//        int expected = 0;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldDecreaseStationNumber() {
//        Radio radio = new Radio();
//
//        radio.setRadioStationNumber(-1);
//
//        int expected = 0;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }


//    @Test
//    public void shouldGetNextStationFromMax() {
//        Radio radio = new Radio();
//        radio.nextStation();
//        radio.setRadioStationNumber(9);
//
//        int expected = 0;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldGetPrevStationFromMin() {
//        Radio radio = new Radio();
//        radio.prevStation();
//
//        int expected = 9;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldGetManuallySetStation() {
//        Radio radio = new Radio();
//
//        radio.setRadioStationNumber(5);
//
//        int expected = 5;
//        int actual = radio.getRadioStationNumber();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void shouldReturnMaxVolume() {
        Radio volume = new Radio();

        volume.setVolumeToMax();

        int expected = 100;
        int actual = volume.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinVolume() {
        Radio volume = new Radio();

        volume.setVolumeToMin();

        int expected = 0;
        int actual = volume.volume;

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

        volume.volumeMoreThanMax();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeLowerThenMin() {
        Radio volume = new Radio();

        volume.volumeLowerThanZero();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldReturnVolumeAfterAHundred() {
//        Radio volume = new Radio();
//        volume.volumeMoreThanMax();
//
//        int expected = 0;
//        int actual = volume.getVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldReturnVolumeAfterZero() {
//        Radio volume = new Radio();
//        volume.volumeLowerThanZero();
//
//        int expected = 0;
//        int actual = volume.getVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
    @Test
    public void shouldReturnNextVolume() {
        Radio volume = new Radio();

        volume.setVolume(-1);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeSetHigherThanMax() {
        Radio volume = new Radio();

        volume.setVolume(101);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
//
//    @Test
//    public void shouldReturnVolumeSetManually() {
//        Radio volume = new Radio();
//
//        volume.setVolume(20);
//
//        int expected = 20;
//        int actual = volume.getVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
}
