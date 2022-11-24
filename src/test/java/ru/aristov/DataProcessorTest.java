package ru.aristov;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DataProcessorTest {
    private List<Movies> movies = List.of(
            new Film(1,5,1),
            new Film(5,6,1),
            new Film(17,4,2),
            new Film(31,3,4),
            new Film(8,2,3),
            new Film(14,1,4),
            new Film(25,1,2),
            new Film(4,5,1),
            new Film(12,3,2),
            new Film(29,1,5),
            new Film(36,1,3),
            new Film(18,5,5)
    );
    private DataProcessor<Film> dataProcessor = new DataProcessor(movies);

    @Test
    void testGetFilterFilmsMethodsFirst() throws Exception {
        List<FilterFilms> filterFilmsMethods = dataProcessor.getFilterFilms(2, 5,4);
        List<FilterFilms> filterFilmsCorrect = List.of(
                new FilterFilms(8,2),
                new FilterFilms(31,3),
                new FilterFilms(12,3),
                new FilterFilms(17,4)
        );
        assertEquals(filterFilmsCorrect, filterFilmsMethods);
    }

    @Test
    void testGetFilterFilmsMethodsExeptionLimit() throws Exception {
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(2, 5,-1));
    }

    @Test
    void testGetFilterFilmsMethodsExeptionMarks() throws Exception {
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(5, 2,4));
    }

    @Test
    void testSearchMarkMethodsFirst() throws Exception {
        assertEquals("Фильм 31: оценка - 3, жанр - 4", dataProcessor.searchMark(3));
    }

    @Test
    void testSearchMarkMethodsExceptionMarkLess0() throws Exception {
        assertThrows(MyException.class, () -> dataProcessor.searchMark(-1));
    }
}