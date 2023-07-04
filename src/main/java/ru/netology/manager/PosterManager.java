package ru.netology.manager;

import ru.netology.domain.Movie;

public class PosterManager {
    private int limit;
    private Movie[] posters = new Movie[0];

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        limit = 5;
    }

    public void save(Movie poster) {
        Movie[] tmp = new Movie[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Movie[] findAll() {
        return posters;
    }

    public Movie[] findLast() {

        int resultLength;
        Movie[] tmp = findAll();

        if (limit >= tmp.length) {
            resultLength = tmp.length;
        } else {
            resultLength = limit;
        }
        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = tmp.length - i - 1;
            result[i] = tmp[index];
        }
        return result;
    }
}