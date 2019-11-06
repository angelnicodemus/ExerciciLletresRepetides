import java.util.ArrayList;
import java.util.List;

/*Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra
	Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.

	FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]

 */




public class fase4 {

	public static void main(String[] args) {

		String n = "Angel";
		String c = "Nicodemus";
		char[]nom = n.toCharArray();
		char[]cognom = c.toCharArray();
		char []espai =  new char[1];

		List<Character> nom2 = new ArrayList<Character>();
		List<Character> cognom2 = new ArrayList<Character>();
		List<Character> nomCognom = new ArrayList<Character>();


		for (int i = 0; i <nom.length; i ++) {
			nom2.add (nom[i]);
			nomCognom.add(nom[i]); 

		}
		nomCognom.add(espai[0]);

		for (int i = 0; i <cognom.length; i ++) {
			cognom2.add (cognom[i]);
			nomCognom.add(cognom[i]);

		}
		System.out.println(nom2);	
		System.out.println(cognom2);
		System.out.println(nomCognom);

	}



}
