package com.example.PR2.repo;

import com.example.PR2.Models.Anime;
import org.springframework.data.repository.CrudRepository;

public interface AnimeRepo extends CrudRepository<Anime, Long> {
    Anime findByName(String name);
}
