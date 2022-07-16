import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmRepoTest {
    private FilmRepository repository = new FilmRepository();

    Film first = new Film(1, "Бладшот", "Боевик");
    Film second = new Film(2, "Вперед", "Мультфильм");
    Film third = new Film(3, "Отель Белград", "Комедия");
    Film fourth = new Film(4, "Джентельмены", "Боевик");
    Film fifth = new Film(5, "Человек-невидимка", "Ужасы");


    @Test
    public void findLastTest() {
        repository.save(first);
        repository.save(second);
        repository.save(third);

        Film[] actual = repository.findAll();
        Film[] expected = {first, second, third};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findIdTest() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);

        Film[] actual = repository.findById(3);
        Film[] expected = {third};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findIdNullTest() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);

        Film[] actual = repository.findById(8);
        Film[] expected = {null};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeIdTest() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);

        Film[] actual = repository.removeById(2);
        Film[] expected = {first, third, fourth};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void removeAllTest() {
        repository.save(first);
        repository.save(second);
        repository.save(third);

        Film[] actual = repository.removeAll();
        Film[] expected = {null};

        Assertions.assertArrayEquals(expected, actual);

    }
}
