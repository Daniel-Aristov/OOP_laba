package ru.aristov;

import org.junit.jupiter.api.Test;

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
        List<FilterFilms> filterFilmsMethodsOne = dataProcessor.getFilterFilms(2, 5,4);
        List<FilterFilms> filterFilmsMethodsTwo = dataProcessor.getFilterFilms(1, 3,4);
        List<FilterFilms> filterFilmsMethodsThree = dataProcessor.getFilterFilms(0, 2,3);
        List<FilterFilms> filterFilmsCorrectOne = List.of(
                new FilterFilms(8,2),
                new FilterFilms(31,3),
                new FilterFilms(12,3),
                new FilterFilms(17,4)
        );
        List<FilterFilms> filterFilmsCorrectTwo = List.of(
                new FilterFilms(14,1),
                new FilterFilms(25,1),
                new FilterFilms(29,1),
                new FilterFilms(8,2)
        );
        List<FilterFilms> filterFilmsCorrectThree = List.of(
                new FilterFilms(14,1),
                new FilterFilms(25,1),
                new FilterFilms(29,1)
        );
        assertEquals(filterFilmsCorrectOne, filterFilmsMethodsOne);
        assertEquals(filterFilmsCorrectTwo, filterFilmsMethodsTwo);
        assertEquals(filterFilmsCorrectThree, filterFilmsMethodsThree);
    }

    @Test
    void testGetFilterFilmsMethodsExeptionLimit() {
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(2, 5,0));
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(2, 5,-1));
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(2, 5,-6));
    }

    @Test
    void testGetFilterFilmsMethodsExeptionMarks() {
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(5, 2,4));
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(1, 0,3));
        assertThrows(MyException.class, () -> dataProcessor.getFilterFilms(6, 4,1));
    }

    @Test
    void testSearchMarkMethodsFirst() throws Exception {
        assertEquals(new FilterFilms(31,3), dataProcessor.searchMark(3));
        assertEquals(new FilterFilms(17,4), dataProcessor.searchMark(4));
        assertEquals(new FilterFilms(1,5), dataProcessor.searchMark(5));
    }

    @Test
    void testSearchMarkMethodsExceptionMarkLess0() {
        assertThrows(MyException.class, () -> dataProcessor.searchMark(-1));
        assertThrows(MyException.class, () -> dataProcessor.searchMark(-3));
        assertThrows(MyException.class, () -> dataProcessor.searchMark(-5));
    }
}