public class AfishaManager {

    protected String[] movies = new String[0];
    protected int limit;

    public AfishaManager() {

        this.limit = 10;
    }

    public AfishaManager(int limit) {

        this.limit = limit;
    }

    public void add(String movie) {
    String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
    int i = tmp.length - 1;
    tmp[i] = movie;
    movies = tmp;

}

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}
