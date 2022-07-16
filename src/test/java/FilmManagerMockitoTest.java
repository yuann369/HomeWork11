import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;

public class FilmManagerMockitoTest {

    private FilmRepository repo = Mockito.mock(FilmRepository.class);
    private FilmManager manager = new FilmManager(repo);


    Film first = new Film(1, "Бладшот", "Боевик");
    Film second = new Film(2, "Вперед", "Мультфильм");
    Film third = new Film(3, "Отель Белград", "Комедия");
    Film fourth = new Film(4, "Джентельмены", "Боевик");
    Film fifth = new Film(5, "Человек-невидимка", "Ужасы");


    @Test
    public void findLastTest() {
        Film[] returned = {first, second, third, fourth, fifth};
        doReturn(returned).when(repo).findAll();

        Film[] actual = manager.findLast();
        Film[] expected = {fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);

    }
}
