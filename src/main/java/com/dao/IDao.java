package com.dao;

import java.util.List;

import com.beans.Utilisateur;

public interface IDao {
	void save(Utilisateur p);
	List<Utilisateur> getAll();
	void remove(Long id);
	Utilisateur getById(Long id);
}
