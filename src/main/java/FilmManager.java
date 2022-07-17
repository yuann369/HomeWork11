public class FilmManager {
    private Film[] films = new Film[0];
    private int countFilm = 10;

    public FilmManager(int countFilm) {
        this.countFilm = countFilm;
    }

    public FilmManager() {
    }


    public void add(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        int resultLength;
        if (films.length > countFilm) {
            resultLength = countFilm;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
