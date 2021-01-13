package fr.eni.dasoto.encheres.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.dasoto.encheres.bo.ArticleVendu;
import fr.eni.dasoto.encheres.bo.Categorie;
import fr.eni.dasoto.encheres.bo.Enchere;
import fr.eni.dasoto.encheres.bo.Retrait;

class ArticleManagerImpl implements ArticleManager {
	List<ArticleVendu> lstArticles = new ArrayList<ArticleVendu>();
	List<Categorie> lstCategorie = new ArrayList<Categorie>();
	List<Enchere> lstEnchere = new ArrayList<Enchere>();
	List<Retrait> lstRetrait = new ArrayList<Retrait>();

	@Override
	public void ajoutArticle(ArticleVendu article, Retrait retrait) throws ArticleException {

		lstArticles.add(article);
		this.ajoutRetrait(retrait);// cas ou l'adresse de retrait est rentré manuellement
		// TODO Faire un cas ou le retrait n'est pas ajouter manuellement donc en
		// utilisant les données de l'utilisateur en session
	}

	public void ajoutRetrait(Retrait retrait) throws ArticleException {
		lstRetrait.add(retrait);
	}

	@Override
	public List<ArticleVendu> getArticle() throws ArticleException {
		return lstArticles;
	}

	/*
	 * GETENCHEREDECO POUR LA DAL TODO MODIF POUR QUE çA MARCHE
	 * 
	 * 
	 * public List<ArticleVendu> getEncheredeco(String nomcategorie, String
	 * nomArticle) throws ArticleException{
	 * 
	 * try { return EnchereDAO.getEnchere(nomcategorie,nomArticle) }catch
	 * (ArticleDALException e) throw new
	 * ArticleDALException("Probleme lors de l'insertion")
	 */

	/*
	 * public List<ArticleVendu> getEnchere(categorie,) throws ArticleException{ try
	 * { return EnchereDAO.getEnchere(Categorie,) } }
	 */

	@Override
	public void ajoutCategorie(Categorie categorie) throws ArticleException {
		lstCategorie.add(categorie);
	}

	@Override
	public void ajoutEnchere(Enchere enchere) throws ArticleException {
		lstEnchere.add(enchere);
	}

	@Override
	public List<ArticleVendu> getEncheredeco(String nomcategorie, String nomArticle) throws ArticleException {
		List<ArticleVendu> resultat = new ArrayList<ArticleVendu>();
		if (nomcategorie != null && nomArticle != null) {
			for (Categorie c : lstCategorie) {
				if (c.getLibelle() == nomcategorie) {
					for (ArticleVendu av : lstArticles) {
						if (av.getCategorieArticle() == c.getNoCategorie()) {
							resultat.add(av);
						}
					}

				}
			}
		}
		if (nomcategorie == null && nomArticle != null) {
			return lstArticles;
			// TODO chercher comment chercher dans une liste un mot
		}

		return resultat;
	}
	
	public List<ArticleVendu> getEnchereco(String ensenfout){
		return null; //TODO completer ceci avec l'envoie en local pour le gars connecté
	}
}
