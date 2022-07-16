public class FilmRepository {
    Film[] films = new Film[0];

    public Film[] findAll() {
        return films;
    }

    public void save(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];

        }
        tmp[length - 1] = film;
        films = tmp;
    }

    public Film[] findById(int id) {
        Film result[] = new Film[1];
        int index = 0;
        for (Film film : films) {
            if (film.getId() == id) {
                result[index] = film;
            }
        }
        return result;
    }

    public Film[] removeById(int id) {
        int length = films.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        return films = tmp;
    }

    public Film[] removeAll() {
        Film[] tmp = new Film[1];
        return films = tmp;
    }
}
