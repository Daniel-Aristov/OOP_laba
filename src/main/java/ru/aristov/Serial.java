package ru.aristov;

class Serial<T> extends Movies implements Media {
    private int countSeries;

    public Serial(int nameSerial, int countSeries, int markSerial, int genreSerial) {
        super(nameSerial, markSerial, genreSerial);
        this.countSeries = countSeries;
    }

    public int getCountSeries() { return countSeries; }

    @Override
    public String getInfo() {
        return "Cериал " + getName() + ": количество серий - " + countSeries;
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
