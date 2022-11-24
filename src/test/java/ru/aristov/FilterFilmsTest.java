package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterFilmsTest {

    FilterFilms filterFilms;

    @BeforeEach
    void prepareData() {
        filterFilms  = new FilterFilms(17,4);
    }

    @Test
    void testGetInfoMethods() {
        String result = "Фильм 17: оценка - 4";
        assertEquals(result, filterFilms.getInfo());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(17, filterFilms.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(4, filterFilms.getMark());
    }
}