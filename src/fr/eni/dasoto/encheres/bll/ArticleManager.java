package fr.eni.dasoto.encheres.bll;

import java.util.List;

import fr.eni.dasoto.encheres.bo.ArticleVendu;
import fr.eni.dasoto.encheres.bo.Categorie;
import fr.eni.dasoto.encheres.bo.Enchere;
import fr.eni.dasoto.encheres.bo.Retrait;

public interface ArticleManager {

	void ajoutArticle(ArticleVendu article,Retrait retrait) throws ArticleException;
	void ajoutCategorie(Categorie categorie) throws ArticleException;
	void ajoutEnchere(Enchere enchere) throws ArticleException;
	
	List<ArticleVendu> getArticle() throws ArticleException;
	List<ArticleVendu> getEncheredeco(String nomcategorie, String nomArticle) throws ArticleException;
	

}
