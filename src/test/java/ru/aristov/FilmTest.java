package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    Film film1, film2;

    @BeforeEach
    void prepareData() {
        film1  = new Film(17,4,2);
        film2  = new Film(24,2,5);
    }

    @Test
    void testGetInfoMethods() {
        assertEquals("Фильм 17: оценка - 4, жанр - 2", film1.getInfo());
        assertEquals("Фильм 24: оценка - 2, жанр - 5", film2.getInfo());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(17, film1.getName());
        assertEquals(24, film2.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(4, film1.getMark());
        assertEquals(2, film2.getMark());
    }

    @Test
    void testGetGenreMethods() {
        assertEquals(2, film1.getGenre());
        assertEquals(5, film2.getGenre());
    }
}