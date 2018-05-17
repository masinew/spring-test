package com.masinew.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.masinew.spring.annotation.annotation.Genre;

public class MovieRecommender {
	
	@Autowired
	@Genre("Action")
	private MovieCatalog actionCatalog;
	
	private MovieCatalog comedyCatalog;

	public MovieCatalog getActionCatalog() {
		return actionCatalog;
	}

	public void setActionCatalog(MovieCatalog actionCatalog) {
		this.actionCatalog = actionCatalog;
	}

	public MovieCatalog getComedyCatalog() {
		return comedyCatalog;
	}

	@Autowired
	public void setComedyCatalog(@Genre("Comedy") MovieCatalog comedyCatalog) {
		this.comedyCatalog = comedyCatalog;
	}
	
	
}
