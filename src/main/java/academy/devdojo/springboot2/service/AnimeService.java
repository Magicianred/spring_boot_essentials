package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService implements AnimeRepository {
    public List<Anime> listAll() {
        return List.of(new Anime(1L, "dbz"), new Anime(2L, "cdz"));
    }
}
