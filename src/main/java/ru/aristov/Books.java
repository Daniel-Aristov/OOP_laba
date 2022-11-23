package ru.aristov;

class Books implements Media {
    private int nameBook;
    private int countPages;
    private int markBook;
    private int genreBook;

    Books (int nameBook, int markBook, int genreBook, int countPages) {
        this.nameBook = nameBook;
        this.markBook = markBook;
        this.genreBook = genreBook;
        this.countPages = countPages;
    }

    public String getInfo() {
        return "Книга " + getName() + ": количество страниц: " + getCountPages() + ", оценка - " + getMark() + ", жанр - " + getGenre();
    }

    public int getCountPages() {
        return countPages;
    }

    @Override
    public int getName() {
        return nameBook;
    }

    @Override
    public int getMark() {
        return markBook;
    }

    @Override
    public int getGenre() {
        return genreBook;
    }
}

