package it.example.spotify_clone.services;

import it.example.spotify_clone.entities.Album;
import it.example.spotify_clone.entities.Artist;
import it.example.spotify_clone.entities.Song;
import it.example.spotify_clone.exceptions.ElementNotFoundException;
import it.example.spotify_clone.repositories.AlbumRepository;
import it.example.spotify_clone.repositories.ArtistRepository;
import it.example.spotify_clone.repositories.SongRepository;
import it.example.spotify_clone.repositories.projections.ReducedAlbumInfo;
import it.example.spotify_clone.repositories.projections.ReducedSongInfo;
import it.example.spotify_clone.utilities.FileUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class SpotifyService {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private SongRepository songRepository;


}