import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	
	private ArrayList<Character> chars;
	private Map map;
	private int intentos;
	private Scanner reader;
	
	public UserInterface(int filas,int columnas, int vampiros, int intentos) {
		this.reader = new Scanner(System.in);
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
			System.out.println();
			System.out.println("Tus movimientos:");
			String movs = reader.nextLine();
			Player pla = (Player)this.chars.get(0);
			Utiles.playerMove(pla, movs);
			Utiles.killVampire(this.chars, pla);
			
			for(Character a: chars) {
				a.move();
			}
			Utiles.killVampire(this.chars, pla);
			if(this.chars.size() == 2) {
				System.out.println("¡¡Enhorabuena!!");
				System.out.println("Has matado a los vampiros sin que Dracula te pillara.");
				System.out.println("Has escapado del castillo. ¡Has ganado!");
				System.exit(0);
			}
			i--;
			if(i== 0) {
				System.out.println("Se te han acabado los turnos.");
				Utiles.gameOver();
			}
		}
	}
	
	public void dibujarMapa() {
		this.map.resetMap();
		this.map.setBoard(this.map.getBoard());
		for (Character v: this.chars) {	
			//System.out.println(this.map.toString());
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

