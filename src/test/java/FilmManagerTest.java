import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    Film first = new Film(1, "Бладшот", "Боевик");
    Film second = new Film(2, "Вперед", "Мультфильм");
    Film third = new Film(3, "Отель Белград", "Комедия");
    Film fourth = new Film(4, "Джентельмены", "Боевик");
    Film fifth = new Film(5, "Человек-невидимка", "Ужасы");
    Film sixth = new Film(6, "Тролли. Мировой тур", "Мультфильм");
    Film seventh = new Film(7, "Номер один", "Комедия");
    Film eighth = new Film(8, "Форрест Гамп", "Драма");
    Film ninth = new Film(9, "1+1", "Драма");
    Film tenth = new Film(10, "Обряд", "Ужасы");
    Film eleventh = new Film(9, "Миньоны: Грювитация", "Мультфильм");
    Film twelve = new Film(9, "Мир Юрского периода: Господство", "Фантастика");


    FilmManager manager = new FilmManager(10);

    @Test
    public void addTest() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Film[] actual = manager.findAll();
        Film[] expected = {first, second, third, fourth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Film[] actual = manager.findLast();
        Film[] expected = {seventh, sixth, fifth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitTest() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        Film[] actual = manager.findLast();
        Film[] expected = {twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        Assertions.assertArrayEquals(expected, actual);
    }
}