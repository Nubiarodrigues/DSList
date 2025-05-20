package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game obj) {
		id = obj.getId();
		title = obj.getTitle();
		year = obj.getYear();
		imgUrl = obj.getImgUrl();
		shortDescription = obj.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection obj) {
		id = obj.getId();
		title = obj.getTitle();
		year = obj.getYear();
		imgUrl = obj.getImgUrl();
		shortDescription = obj.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
