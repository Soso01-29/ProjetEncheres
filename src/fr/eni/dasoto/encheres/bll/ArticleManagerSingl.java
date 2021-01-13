package fr.eni.dasoto.encheres.bll;

public class ArticleManagerSingl {
	private static ArticleManager instance;
	
	public static ArticleManager getInstance() {
		if(instance==null) {
			instance = new ArticleManagerImpl();
		}
		return instance;
	}

}
