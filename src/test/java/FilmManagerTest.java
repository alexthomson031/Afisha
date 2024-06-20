import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManager;
import ru.netology.Films;

import java.util.Arrays;

public class FilmManagerTest {
    private final FilmManager manager = new FilmManager(10);

    private final Films first = new Films(1, "bloodShot", "thriller");
    private final Films second = new Films(2, "forward", "cartoon");
    private final Films third = new Films(3, "hotelBelgrade", "comedy");
    private final Films fourth = new Films(4, "gentlemen", "thriller");
    private final Films fifth = new Films(5, "invisibleMan", "horror");
    private final Films sixth = new Films(6, "trollsWorldTour", "cartoon");
    private final Films seventh = new Films(7, "numberOne", "comedy");
    private final Films eighth = new Films(8, "spiderMan2", "fantasy");
    private final Films ninth = new Films(9, "spiderMan3", "fantasy");
    private final Films tenth = new Films(10, "spiderMan3", "fantasy");
    private final Films eleventh = new Films(11, "Mario", "cartoon");


    @BeforeEach
    public void setup() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
    }


    @Test
    @DisplayName("Отображаю все фильмы по убыванию id")
    public void showAllSavedFilmsBack() {
        Films[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Films[] actual = manager.findLast();
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Отображаю все фильмы по возрастанию id")
    public void showAllSavedFilmsNorm() {
        FilmManager manager = new FilmManager(8);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        Films[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth};
        Films[] actual = manager.showAllNorm();
        System.out.println(Arrays.toString(manager.showAllNorm()));
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Отображаю последние добавленные элементы")
    public void shouldShowReversedList() {
        FilmManager manager = new FilmManager(5);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        Films[] expected = {ninth, eighth, seventh, sixth, fifth};
        Films[] actual = manager.findAll();
        System.out.println(Arrays.toString(manager.findAll()));
        Assertions.assertArrayEquals(expected, actual);
    }

    // @Test
    void showEmpty() {
        FilmManager manager = new FilmManager(15);
        Films[] actual = manager.findAll();
        Films[] expected = new Films[]{};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void showEmpty1() {
        FilmManager manager = new FilmManager(-1);
        manager.save(fifth);
        manager.save(sixth);
        Films[] actual = manager.findAll();
        Films[] expected = new Films[]{};
        Assertions.assertArrayEquals(expected, actual);
    }
}
