package exer2;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		Computador comp = new Computador("i5", 512, 16, 7000.00);
		if(dao.inserirComputador(comp) == true) {
			System.out.println("Inserção com sucesso -> " + comp.toString());
		}
		
		System.out.println("==== Mostrar computadores === ");
		Compurador comps [] = new Computador[15];
		comps [0] = dao.getComputador();
		for(int i = 0; i < comps.length; i++) {
			System.out.println(comps[i].toString());
		}
		
		dao.excluirUsuario(comp.getCodigo());
		
		comps = dao.getComputador();
		System.out.println("==== Mostrar computadores === ");		
		for(int i = 0; i < comps.length; i++) {
			System.out.println(comps[i].toString());
		}
		
		dao.close();
	}
}
