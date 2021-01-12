package fr.eni.dasoto.encheres.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.dasoto.encheres.bo.Utilisateur;

class UtilisateurManagerImpl implements UtilisateurManager{
	//UtilisateurDAO utilisateurDAO = DAOFact.getUtilisateurDAO();
	List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();
	
	
	@Override
	public void ajouterUtilisateur(Utilisateur utilisateur) throws UtilisateurException {
		listeUtilisateurs.add(utilisateur);
		/*
		try{
			return utilisateurDAO.insert(utilisateur);
		}catch(UtilisateurDALException){
			e.printStackTrace();
			throw new Utilisateur("Un problème est survenu lors de l'inscription!");
		}
		*/
		
	}

	@Override
	public List<Utilisateur> getUtilisateur() throws UtilisateurException{
		/*
		 try{
			return utilisateurDAO.getAll();
		}catch(UtilisateurDALException){
			e.printStackTrace();
			throw new Utilisateur("Un problème de section en base!");
		}
		*/
		return listeUtilisateurs;
	}
	
	public void modifierUtilisateur(Utilisateur utilisateur) {
		//TODO le 1er utilisation sera l'utilisateur de la session
		Utilisateur.setPseudo(Utilisateur.getPseudo());	
		Utilisateur.setNom(Utilisateur.getNom());
		Utilisateur.setPrenom(Utilisateur.getPrenom());
		Utilisateur.setEmail(Utilisateur.getEmail());
		Utilisateur.setTelephone(Utilisateur.getTelephone());
		Utilisateur.setRue(Utilisateur.getRue());
		Utilisateur.setCodePostal(Utilisateur.getCodePostal());
		Utilisateur.setMotDePasse(Utilisateur.getMotDePasse());
	}
	
	public void supprimerUtilisateur(Utilisateur utilisateur) {
		listeUtilisateurs.remove(utilisateur);
	}
	
}
