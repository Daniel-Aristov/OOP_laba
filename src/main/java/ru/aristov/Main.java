package ru.aristov;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Movies> movies = List.of(
                new Film(1,5,1),
                new Film(5,3,1),
                new Film(17,4,2),
                new Film(31,3,4),
                new Serial(7,10,5,6),
                new Serial(3, 16,2,8),
                new Serial(2, 20,3,8),
                new Serial(6, 12,3,5)
        );

        List<Books> books = List.of(
                new Books(1, 2, 5, 120),
                new Books(8, 3, 2, 760),
                new Books(12, 2, 8, 240),
                new Books(4, 4, 10, 561),
                new Books(56, 4, 4, 148),
                new Books(22, 6, 1, 60)
        );

        List<Media> media = Stream.concat(movies.stream(), books.stream()).toList();
        Statistic.statisticMedia(media);
        System.out.println("===============================");

        /* Рейтинг фильмов. Необходимо вывести фильмы, чья оценка больше или равна 3, но меньше 5,
           отсортированный по увеличению оценки с максимумом в 3 элемента. Сделать поиск по оценке. */

        DataProcessor<Film> dataProcessor = new DataProcessor(movies);

        System.out.println();
        try {
            List<FilterFilms> filterFilms = dataProcessor.getFilterFilms(3, 5, 3);
            if (filterFilms.isEmpty()) {
                System.out.println("Нет данных");
            } else {
                for (FilterFilms filterFilm : filterFilms) {
                    System.out.println(filterFilm.getInfo());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Поиск фильма по оценке:");
        try {
            System.out.println(dataProcessor.searchMark(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}