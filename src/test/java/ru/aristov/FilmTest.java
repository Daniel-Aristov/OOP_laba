package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    Film film;

    @BeforeEach
    void prepareData() {
        film  = new Film(17,4,2);
    }

    @Test
    void testGetInfoMethods() {
        String result = "Фильм 17: оценка - 4, жанр - 2";
        assertEquals(result, film.getInfo());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(17, film.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(4, film.getMark());
    }

    @Test
    void testGetGenreMethods() {
        assertEquals(2, film.getGenre());
    }
}