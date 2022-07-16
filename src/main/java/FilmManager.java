public class FilmManager {
    private int countFilm = 10;
    private FilmRepository repo = new FilmRepository();

    public FilmManager(FilmRepository repo) {
        this.repo = repo;
    }

    public FilmManager(int countFilm) {
        this.countFilm = countFilm;
    }

    public FilmManager() {
    }


    public void add(Film film) {
        repo.save(film);
    }

    public Film[] findAll() {
        Film[] all = repo.findAll();
        return all;
    }

    public Film[] findLast() {
        Film[] all = repo.findAll();
        int resultLength;
        if (all.length > countFilm) {
            resultLength = countFilm;
        } else {
            resultLength = all.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = all.length - i - 1;
            result[i] = all[index];
        }
        return result;
    }
}
