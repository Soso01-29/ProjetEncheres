package fr.eni.dasoto.encheres.bo;

public class Categorie {

	private Integer noCategorie;
	private String libelle;

	public Categorie() {

	}

	public Categorie(String libelle) {

		this.libelle = libelle;
	}

	public Integer getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(Integer noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}

}
