package com.aravind.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.lookify.models.Song;
import com.aravind.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository repository;
	
	public SongService(SongRepository songRepository) {
		this.repository = songRepository;
	}
	
	public Song createSong(Song song) {
		return repository.save(song);
	}
	
	public List<Song> findAllSongs() {
		return repository.findAll();
	}
	
	public Song findLanguage(Long id) {
		Optional<Song> optionalSong = repository.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
	}
	
	public List<Song> findByArtist(String search) {
		return repository.findByArtistContaining(search);
	}
	
	public List<Song> findTopTenSongs() {
		return repository.findByRatingOrderByRatingDescLimitedTo(10);
	}
	
	public Song updateSong(Song song) {
		return repository.save(song);
	}
	
	public void deleteSong(Long id) {
		repository.deleteById(id);
	}
}
