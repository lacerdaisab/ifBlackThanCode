import java.util.ArrayList;

public class RegistrosArrayList {

	public static void main(String[] args) {
		//CRUD - CREATE
		ArrayList<String> pessoas = new ArrayList<String>();
		pessoas.add("isa");
		pessoas.add("duda");
		pessoas.add("gabi");
		pessoas.add("Deus");
		
		//CRUD - READ
		System.out.println(pessoas);
		System.out.println(pessoas.get(1));
		System.out.println(pessoas.get(2));
		
		//CRUD - UPDATE
		System.out.println(pessoas);
		pessoas.set(1, "gabi");
		pessoas.set(2, "duda");
		System.out.println(pessoas.get(1));
		System.out.println(pessoas.get(2));
		System.out.println(pessoas);
		
		//CRUD - DELETE
		pessoas.remove(1);
		System.out.println(pessoas);
		
		//Array size
		System.out.println(pessoas.size());
		
		for (int count = 0; count < pessoas.size(); count++) {
			System.out.println(pessoas.get(count));
		}
		
		for (String count:pessoas) {
			System.out.println(count);
		}
	}
}
