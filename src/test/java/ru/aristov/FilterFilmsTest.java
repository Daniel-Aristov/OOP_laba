package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterFilmsTest {

    FilterFilms filterFilms1, filterFilms2;

    @BeforeEach
    void prepareData() {
        filterFilms1  = new FilterFilms(17,4);
        filterFilms2  = new FilterFilms(5,3);
    }

    @Test
    void testGetInfoMethods() {
        assertEquals("Фильм 17: оценка - 4", filterFilms1.getInfo());
        assertEquals("Фильм 5: оценка - 3", filterFilms2.getInfo());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(17, filterFilms1.getName());
        assertEquals(5, filterFilms2.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(4, filterFilms1.getMark());
        assertEquals(3, filterFilms2.getMark());
    }
}