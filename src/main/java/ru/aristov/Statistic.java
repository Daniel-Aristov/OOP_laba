package ru.aristov;

import java.util.*;

import static java.lang.String.format;

public class Statistic {
    private static int sum = 0,
            maxMark = -1,
            minMark = Integer.MAX_VALUE;
    private static double averageMark = 0;

    public static void statisticMedia(List<Media> media) {
        // Получение массивов только по фильмам и сериалам
        Set<Integer> film = new LinkedHashSet<>();
        List<Integer> mark = new ArrayList<>();
        List<Integer> genre = new ArrayList<>();
        for (Media value : media) {
            if (value instanceof Film || value instanceof Serial) {
                film.add(value.getName());
                mark.add(value.getMark());
                genre.add(value.getGenre());
            }
        }

        // Поиск максимальной, минимальной и средней оценки
        for (int i = 0; i < mark.size(); i++) {
            sum += mark.get(i);
            if (mark.get(i) > maxMark) maxMark = mark.get(i);
            if (mark.get(i) < minMark) minMark = mark.get(i);
            averageMark = (double) sum / mark.size();
        }

        // Получение статистики по жанрам фильмов и сериалов
        Map<Integer, Integer> marks = new HashMap<>();
        Map<Integer, Integer> countView = new HashMap<>();
        for (Integer integer : genre) {
            marks.put(integer, 0);
            countView.put(integer, 0);
        }
        for (int i = 0; i < genre.size(); i++) {
            int buffMarks = marks.get(genre.get(i));
            int buffCountView = countView.get(genre.get(i));
            buffMarks += mark.get(i);
            buffCountView++;
            marks.put(genre.get(i), buffMarks);
            countView.put(genre.get(i), buffCountView);
        }

        // Вывод информации в консоль по всем медиа
        System.out.println("ИНФОРМАЦИЯ ПО ФИЛЬМАМ, CЕРИАЛАМ И КНИГАМ");
        for (Media value : media) {
            System.out.println(value.getInfo());
        }

        // Вывод статистики жанров по фильмам и сериалам
        System.out.println("\nСТАТИСТИКА ЖАНРОВ ПО ФИЛЬМАМ И СЕРИАЛАМ" + "\nСредняя оценка: " + format("%.1f", averageMark) + "\nМаксимальная оценка: " + maxMark + "\nМинимальная оценка: " + minMark);
        for (Map.Entry<Integer, Integer> entry : countView.entrySet()) {
            if (marks.get(entry.getKey()) % entry.getValue() != 0) {
                double averageMarkFilmDouble = (double) marks.get(entry.getKey()) / entry.getValue();
                System.out.println("Жанр " + entry.getKey() + ": просмотренно " + entry.getValue() + ", средняя оценка " + averageMarkFilmDouble);
            } else {
                int averageMarkFilmInt = marks.get(entry.getKey()) / entry.getValue();
                System.out.println("Жанр " + entry.getKey() + ": просмотренно " + entry.getValue() + ", средняя оценка " + averageMarkFilmInt);
            }
        }
    }
}
