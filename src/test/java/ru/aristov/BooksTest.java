package ru.aristov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    Books book;

    @BeforeEach
    void prepareData() {
        book  = new Books(8, 3, 2, 760);
    }

    @Test
    void testGetInfoMethods() {
        String result = "����� 8: ���������� �������: 760, ������ - 3, ���� - 2";
        assertEquals(result, book.getInfo());
    }

    @Test
    void testGetCountPagesMethods() {
        assertEquals(760, book.getCountPages());
    }

    @Test
    void testGetNameMethods() {
        assertEquals(8, book.getName());
    }

    @Test
    void testGetMarkMethods() {
        assertEquals(3, book.getMark());
    }

    @Test
    void testGetGenreMethods() {
        assertEquals(2, book.getGenre());
    }
}