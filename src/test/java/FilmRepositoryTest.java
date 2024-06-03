import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManager;
import ru.netology.FilmRepository;
import ru.netology.Films;

public class FilmRepositoryTest {

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


    @Test
    public void test() {
        FilmRepository repo = new FilmRepository();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);

        Films[] expected = {film1,film2,film3,film4,film5,film6,film7,film8,film9,film10};
        Films[] actual = repo.getFilms();

        Assertions.assertArrayEquals(expected,actual);

    }

}
