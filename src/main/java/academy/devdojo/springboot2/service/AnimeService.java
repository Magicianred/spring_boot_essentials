package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    private List<Anime> animes = List.of(new Anime(1L, "dbz"), new Anime(2L, "cdz"));

    public List<Anime> listAll() {
        return animes;
    }

    public List<Anime> findById() {
        return List.of(new Anime(1L, "dbz"), new Anime(2L, "cdz"));
    }
}


