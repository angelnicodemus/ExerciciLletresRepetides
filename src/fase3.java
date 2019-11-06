import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;



// Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen




/*Canvia la taula per una llista (List<Character>)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
 */



public class fase3 {

	public static void main(String[] args) {

		String n = "Angel";
		n= n.toLowerCase();
		char[]nom = n.toCharArray();
		List<Character> nom2 = new ArrayList<Character>();
		char a='a';
		char e='e';
		char i='i';
		char o='o';
		char u='u';
		char espacio = ' ';

		int nu1='1';
		int nu2='2';
		int nu3='3';
		int nu4='4';
		int nu5='5';
		int nu6='6';
		int nu7='7';
		int nu8='8';
		int nu9='9';
		int nu0='0';
		int contador = 0 ;
		HashMap<Character,Integer> nameMap = new HashMap<Character,Integer>();		



		for (int j = 0; j <nom.length; j ++) {
			nom2.add (nom[j]);

		}
		for (int j = 0; j < nom.length; j++) {

			if(nom[j]==a||nom[j]==e||nom[j]==i||
					nom[j]==o||nom[j]==u) {
				System.out.println("Caracter: "+nom[j]+" Es una vocal");
			}else if (nom[j]==espacio) {
				System.out.println("Caracter: "+nom[j]+" Es un espai");
			}else if ((nom[j]==nu1)||(nom[j]==nu2)||(nom[j]==nu3)||(nom[j]==nu4)||(nom[j]==nu5)||(nom[j]==nu6)||
					(nom[j]==nu7)||(nom[j]==nu8)||(nom[j]==nu9)||(nom[j]==nu0)) {
				System.out.println("Caracter: "+nom[j]+" Els noms de persones no contenen números!");

			}
			else {
				System.out.println("Caracter: "+nom[j]+" Es una consonant");

			}		

		}
		for (int k = 0; k < nom.length; k++) {
			for (int j = 0 ; j < nom.length; j++)
				if(nom[j] == nom[k])
					contador++;
			System.out.println("el caracter: "+nom[k]+" se repite " + contador + " veces.");

			nameMap.put(nom2.get(k), contador);

			contador=0;
		}

		System.out.println(nameMap);

	}



}









