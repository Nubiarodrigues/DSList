package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dtos.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		return gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public GameListDTO findById(Long id) {
		GameList result = gameListRepository.findById(id).get();
		return new GameListDTO(result);
	}

}
