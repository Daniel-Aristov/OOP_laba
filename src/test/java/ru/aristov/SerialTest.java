package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerialTest {

    Serial serial1, serial2;

    @BeforeEach
    void prepareData() {
        serial1  = new Serial(7,10,5,6);
        serial2  = new Serial(15,16,4,3);
    }

    @Test
    void testGetInfoMethods() {
        assertEquals("Cериал 7: количество серий - 10", serial1.getInfo());
        assertEquals("Cериал 15: количество серий - 16", serial2.getInfo());
    }

    @Test
    void testGetCountSeriesMethods() {
        assertEquals(10, serial1.getCountSeries());
        assertEquals(16, serial2.getCountSeries());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(7, serial1.getName());
        assertEquals(15, serial1.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(5, serial1.getMark());
        assertEquals(4, serial2.getMark());
    }

    @Test
    void testGetGenreMethods() {
        assertEquals(6, serial1.getGenre());
        assertEquals(3, serial2.getGenre());
    }
}