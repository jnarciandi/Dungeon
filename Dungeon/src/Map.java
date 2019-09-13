import java.util.ArrayList;

public class Map {
	private ArrayList<String> board;
	private int filas;
	private int columnas;

	
	
	public Map(int x, int y) {
		this.filas = x;
		this.columnas = y;
		this.board = new ArrayList<String>();
		for (int i=0;i<y;i++) {
			this.board.add(linea(x));
		}		
	}
		
	public String linea(int tam) {
		String line = ("");		
		for(int i=0;i<tam;i++) {
			line = line.concat(".");
		}
		return line;
	}
	
	public void printMap() {
		for(String i : this.board) {
			System.out.println(i);
		}
	}
	
	public void resetMap() {
		this.board = new ArrayList<String>();
		for (int i=0;i<this.filas;i++) {
			this.board.add(linea(this.columnas));
		}
	}
	
	//getters and setters

	public ArrayList<String> getBoard() {
		return board;
	}



	public void setBoard(ArrayList<String> board) {
		this.board = board;
	}

	@Override
	public String toString() {
		return "Map [board=" + board + "]";
	}
	
}
