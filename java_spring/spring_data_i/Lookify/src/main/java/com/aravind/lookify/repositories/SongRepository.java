package com.aravind.lookify.repositories;

import java.util.List;

import com.aravind.lookify.models.Song;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
	List<Song> findAll();
	List<Song> findByArtistContaining(String search);
	List<Song> findByRatingOrderByRatingDescLimitedTo(int limit);
}
