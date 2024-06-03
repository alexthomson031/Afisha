package ru.netology;

public class FilmManager {
    private FilmRepository repo;

    private Films films = new Films();

    public void add(Films film) {
        repo.save(film);
    }

    private int limit = 5;

    public FilmManager() {
    }
    public FilmManager(int limit) {
        this.limit = limit;

    }

    public Films[] findlast() {
        int resultLenght;
        Films[] all = repo.getFilms();
        FilmManager repo = new FilmManager();
        Films[] tmp = new Films[all.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = all[all.length -1 -i];
        }
        if (all.length < limit) {
            resultLenght = all.length;
        } else {
            resultLenght = limit;
            System.out.println(tmp[5]);
        }
        return tmp;
    }

    public Films[] getReversedFilms() {
        Films[] all = repo.getFilms();
        Films[] reversed = new Films[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 -i];
            }
        return reversed;
    }

    public Films[] showAll() {
        Films[] all = repo.getFilms();
        int length = limit;
        if (length > all.length) {
            length = all.length;
        }
        if (limit <= 0) {
            length = all.length;
        }
        Films[] result = new Films[length];
        for (int i = 0; i < length; i++) {
            int index = all.length - i - 1;
            result[i] = Films[index];
        }
        return result;
    }
}
