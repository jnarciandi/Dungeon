import java.util.ArrayList;

public class UserInterface {
	
	private ArrayList<Character> chars;
	private Map map;
	private int intentos;
	
	public UserInterface(int filas,int columnas, int vampiros, int intentos) {
		this.map =new Map(filas,columnas);
		this.intentos = intentos;
		this.chars = new ArrayList<Character>();
		this.chars.add(new Player(filas, columnas));
		for (int i =0; i<vampiros;i++) {
			this.chars.add(new Vampire(filas, columnas));
		}
		this.chars.add(new Dracula(filas,columnas));
		
	}
	
	public void Start() {
		System.out.println("Bienvenidos a la caza de los vampiros!");
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Intenta capturar a los vampiros pero no dejes que Dracula te pille.");
		System.out.println("Muevete usando w,s,a,d. Tiene "+intentos+" intentos.");
		System.out.println();
		
		int i=intentos;
		while (i > 0) {
			System.out.println(i);
			System.out.println();
			for(Character v : chars) {
				System.out.println(v);
			}
			System.out.println();
			dibujarMapa();
			//System.out.println(this.map);
			this.map.printMap();
			
		}
	}
	
	public void dibujarMapa() {
		this.map.setBoard(this.map.getCleanBoard());
		for (Character v: this.chars) {	
			System.out.println(this.map.toString());
			String linea = this.map.getBoard().get(v.getFila());
			if (v.getColumna() == v.columnamax) {
				linea = linea.substring(0, v.getColumna()) + v.getForm();
			}else {
				linea = linea.substring(0, v.getColumna()) + v.getForm() + linea.substring(v.getColumna()+1);
			}
			this.map.getBoard().set(v.getFila(), linea);			
	}
	}
		
	

}

