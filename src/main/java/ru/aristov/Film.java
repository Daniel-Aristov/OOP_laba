package ru.aristov;

class Film extends Movies implements Media {

    public Film (int nameFilm, int markFilm, int genreFilm) {
        super(nameFilm, markFilm, genreFilm);
    }

    @Override
    public String getInfo() {
        return "����� " + getName() + ": ������ - " + getMark() + ", ���� - " + getGenre();
    }

    @Override
    public int getName() {
        return name;
    }

    @Override
    public int getMark() {
        return mark;
    }

    @Override
    public int getGenre() {
        return genre;
    }
}

