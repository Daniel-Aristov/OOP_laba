package ru.aristov;

abstract class Movies implements Media {
    protected int name;
    protected int mark;
    protected int genre;

    Movies (int nameMovies, int markMovies, int genreMovies) {
        this.name = nameMovies;
        this.mark = markMovies;
        this.genre = genreMovies;
    }

    public abstract int getName();
    public abstract int getMark();
    public abstract int getGenre();
}

