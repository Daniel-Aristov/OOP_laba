package ru.aristov;

public class FilterFilms {
    private final int nameFilm;
    private final int markFilm;

    public FilterFilms(int nameFilm, int markFilm) {
        this.nameFilm = nameFilm;
        this.markFilm = markFilm;
    }

    public String getInfo() {
        return "Фильм " + nameFilm + ": оценка - " + markFilm;
    }

    public int getName() {
        return nameFilm;
    }
    public int getMark() {
        return markFilm;
    }
}
