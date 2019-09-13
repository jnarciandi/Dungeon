import java.util.ArrayList;

public class Map {
	private ArrayList<String> board;
	private ArrayList<String> cleanBoard;
	
	
	public Map(int x, int y) {
		this.cleanBoard = new ArrayList<String>();
		for (int i=0;i<y;i++) {
			this.cleanBoard.add(linea(x));
		}
		this.board = new ArrayList<String>();
		this.board
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

	
	
	
	
	//getters and setters

	public ArrayList<String> getBoard() {
		return board;
	}



	public void setBoard(ArrayList<String> board) {
		this.board = board;
	}



	public ArrayList<String> getCleanBoard() {
		return cleanBoard;
	}



	public void setCleanBoard(ArrayList<String> cleanBoard) {
		this.cleanBoard = cleanBoard;
	}



	@Override
	public String toString() {
		return "Map [board=" + board + ", cleanBoard=" + cleanBoard + "]";
	}
	
	
	
	
	

}
