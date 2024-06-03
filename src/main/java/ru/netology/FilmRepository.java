package ru.netology;

public class FilmRepository {
     private Films[] films = new Films[0];

    public void save (Films film){
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films=tmp;
    }

    public Films[] getFilms() {
       return films;
    }


}
