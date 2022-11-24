package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerialTest {

    Serial serial;

    @BeforeEach
    void prepareData() {
        serial  = new Serial(7,10,5,6);
    }

    @Test
    void testGetInfoMethods() {
        String result = "Cериал 7: количество серий - 10";
        assertEquals(result, serial.getInfo());
    }

    @Test
    void testGetCountSeriesMethods() {
        assertEquals(10, serial.getCountSeries());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(7, serial.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(5, serial.getMark());
    }

    @Test
    void testGetGenreMethods() {
        assertEquals(6, serial.getGenre());
    }
}