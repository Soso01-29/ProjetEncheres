package fr.eni.dasoto.encheres.bll;

import java.util.List;

import fr.eni.dasoto.encheres.bo.Utilisateur;

public interface UtilisateurManager {

	public void ajouterUtilisateur(Utilisateur utilisateur) throws UtilisateurException;
	public List<Utilisateur> getUtilisateur() throws Exception;	
	public void modifierUtilisateur(Utilisateur utilisateur);
	public void  supprimerUtilisateur(Utilisateur utilisateur);
	
}