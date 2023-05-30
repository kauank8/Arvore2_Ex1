package view;

import br.com.kauanPaulino.ArvoreInt.Arvore;

public class main {

	public static void main(String[] args) {
		int vt[]= {30,15,60,10,20,40,80};
		Arvore arv = new Arvore();
		for(int i:vt) {
			arv.insert(i);
		}
		try {
			System.out.println("Atravessamento:");
			arv.infixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
