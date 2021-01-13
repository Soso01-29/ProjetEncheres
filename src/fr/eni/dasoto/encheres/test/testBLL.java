package fr.eni.dasoto.encheres.test;

import fr.eni.dasoto.encheres.bll.UtilisateurException;
import fr.eni.dasoto.encheres.bll.UtilisateurManager;
import fr.eni.dasoto.encheres.bll.UtilisateurManagerSingl;
import fr.eni.dasoto.encheres.bo.Utilisateur;


public class testBLL {

	private static UtilisateurManager manager  = UtilisateurManagerSingl.getInstance();
	
	public static void main(String[] args) throws UtilisateurException {
		Utilisateur u1 = new Utilisateur("Darkyso","Grelaud","Solène","blabla@gmail.com","0298010203","12 rue des marguerites","29120","Pont l'abbé","abcd01",0,true);
		Utilisateur u2 = new Utilisateur("Chairpandore","Quélen","Tony","tony@gmail.com","0298010204","13 rue des marguerites","29120","Pont l'abbé","abcd02",0,true);
		Utilisateur u3 = new Utilisateur("David","Cuomo","David","David-asselof@gmail.com","0298010205","14 rue des marguerites","29120","Pont l'abbé","abcd03",0,true);
	
		manager.ajouterUtilisateur(u1);
		manager.ajouterUtilisateur(u2);
		manager.ajouterUtilisateur(u3);
		
		try {
			System.out.println(manager.getUtilisateur());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
