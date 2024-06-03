import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManager;
import ru.netology.FilmRepository;
import ru.netology.Films;

public class FilmManagerTest {

    FilmRepository repo = new FilmRepository();
    FilmManager manager = new FilmManager(repo);
    FilmManager limit = new FilmManager(lim);

    Films film1 = new Films(1, "Pauk");
    Films film2 = new Films(2, "Chelovek");
    Films film3 = new Films(3, "Muxa");
    Films film4 = new Films(4, "Pulya");
    Films film5 = new Films(5, "Tigr");
    Films film6 = new Films(6, "Lev");
    Films film7 = new Films(7, "Slon");
    Films film8 = new Films(8, "Nosorog");
    Films film9 = new Films(9, "Ezh");
    Films film10 = new Films(10, "Zayac");


    @BeforeEach
    public void setup() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
    }

    @Test
    public void shouldShowReversedList() {

        Films[] expected = {film10, film9, film8, film7, film6, film5, film4 , film3, film2, film1};
        Films[] actual = manager.getReversedFilms();


        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void shouldShowReversed5List() {

        FilmManager manager = new FilmManager(repo);

        Films[] expected = {film10, film9, film8, film7, film6, film5};
        Films[] actual = manager.findlast();


        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void last5Films() {
        FilmManager = new FilmManager(repo);

        Films[] expected = { film10, film9, film8, film7, film6};

    }
}
