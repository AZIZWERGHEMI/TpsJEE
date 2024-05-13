package presentation;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domaine.Produit;
import services.ProduitSessionRemote;

public class ClientEJBRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context ctx =new InitialContext();
			String jndiBeanName="ejb:/ejb_app_tp08/PR!services.ProduitSessionRemote";
			ProduitSessionRemote beanRemote=(ProduitSessionRemote)ctx.lookup(jndiBeanName);
			Produit p = new Produit();
			beanRemote.addProduit(p);
			List<Produit> lp = beanRemote.getAllProduits();
			System.out.println("-------------------");
			for( Produit pi : lp) {
				System.out.println(pi);
			}
			System.out.println("-------------------");
		}catch(NamingException e){
			e.printStackTrace();
		}
	}

}
