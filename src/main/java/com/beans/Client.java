package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="client")
@Data
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="nomUtilisateur")
	private String nomUtilisateur ;
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Client(String login, String password, String nom, String prenom, String nomUtilisateur) {
		super(login, password);
		this.nom = nom;
		this.prenom = prenom;
		this.nomUtilisateur = nomUtilisateur;
	}
	
	
	
	
}
