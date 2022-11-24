package ru.aristov;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterFilms that = (FilterFilms) o;
        return nameFilm == that.nameFilm && markFilm == that.markFilm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFilm, markFilm);
    }

    @Override
    public String toString() {
        return "FilterFilms{" +
                "nameFilm=" + nameFilm +
                ", markFilm=" + markFilm +
                '}';
    }
}
