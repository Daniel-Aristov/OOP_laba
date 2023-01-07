package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    Books book1, book2;

    @BeforeEach
    void prepareData() {
        book1  = new Books(8, 3, 2, 760);
        book2  = new Books(15, 5, 4, 264);
    }

    @Test
    void testGetInfoMethods() {
        assertEquals("Книга 8: количество страниц: 760, оценка - 3, жанр - 2", book1.getInfo());
        assertEquals("Книга 15: количество страниц: 264, оценка - 5, жанр - 4", book2.getInfo());
    }

    @Test
    void testGetCountPagesMethods() {
        assertEquals(760, book1.getCountPages());
        assertEquals(264, book2.getCountPages());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(8, book1.getName());
        assertEquals(15, book2.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(3, book1.getMark());
        assertEquals(5, book2.getMark());
    }

    @Test
    void testGetGenreMethods() {
        assertEquals(2, book1.getGenre());
        assertEquals(4, book2.getGenre());
    }
}