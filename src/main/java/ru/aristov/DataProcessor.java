package ru.aristov;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DataProcessor<T extends Movies> {
    List<T> films;

    public DataProcessor(List<T> films) {
        this.films = films;
    }

    public List<FilterFilms> getFilterFilms(int more, int less, int limit) throws Exception {
        if (more > less) {
            throw new MyException("��������� ������ ������ ��������");
        }
        if (limit < 1) {
            throw new MyException("������������ �����������");
        }
        System.out.println("������� �� �������");
        return films.stream()
                .filter(film -> (film.getMark() >= more && film.getMark() < less))
                .limit(limit)
                .sorted(Comparator.comparing(Movies::getMark))
                .map(film -> new FilterFilms(film.getName(), film.getMark()))
                .toList();
    }

    public String searchMark(int mark) throws Exception {
        if (mark < 0) {
            throw new MyException("������ ������ 0");
        }
        Optional<T> filmOptional = films.stream()
                .filter(films -> films.getMark() == mark)
                .findFirst();

        if (filmOptional.isPresent()) {
            return filmOptional.get().getInfo();
        } else {
            return "��� ������";
        }
    }
}
