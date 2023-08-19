package com.example.lookify.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.lookify.models.Song;

@Repository
public interface SongRepo extends CrudRepository<Song, Long> {
	
	List<Song> findAll();
	
	@Query(value = "SELECT * FROM songs ORDER BY rating DESC LIMIT  10;", nativeQuery = true) 
	List<Song> getTopTen();
	
	//BUSCAR POR ARTISTA
//	@Query(value = "SELECT * FROM songs WHERE artist LIKE %:artist%", nativeQuery = true) 
//	List<Song> findByArtist(@Param("artist") String artist);

	//BUSCAR POR ARTISTA O TITULO
	List<Song> findByArtistContainingOrTitleContaining(String artist, String title);

}
