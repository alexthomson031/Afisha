package ru.netology;

public class FilmManager {
    private Films[] films = new Films[0];
    private int limit = 5;

    public FilmManager() {
    }

    public FilmManager(int limit) {
        this.limit = limit;

    }

    public void save(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] showAllNorm() {
        int length = limit;
        Films[] result = new Films[length];
        for (int i = 0; i < length; i++) {
            result[i] = films[i];
        }
        return result;
    }

    public Films[] showAllBack() {
        int length = limit;
        Films[] result = new Films[length];
        for (int i = 0; i < length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public Films[] showAll() {
        int length = limit;
        if (length >= films.length) {
            length = films.length;
        }
        if (length < films.length && length > 0) {
            length = films.length;
        }
        if (length < 0) {
            return new Films[0];
        }
        Films[] result = new Films[length];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}