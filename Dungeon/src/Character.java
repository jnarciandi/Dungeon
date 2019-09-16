import java.util.ArrayList;
import java.util.Random;

public abstract class Character {
	
	
	protected int filamax;
	protected int columnamax;
	protected Random random;
	
	public Character(int fila, int columna) {
		this.filamax = fila;
		this.columnamax = columna;
		this.random = new Random();
	}
	
	
	public abstract void move(ArrayList<Character> chars);
	public abstract int getFila();
	public abstract int getColumna();
	public abstract String getForm();




	public int getFilamax() {
		return filamax;
	}


	public void setFilamax(int filamax) {
		this.filamax = filamax;
	}


	public int getColumnamax() {
		return columnamax;
	}


	public void setColumnamax(int columnamax) {
		this.columnamax = columnamax;
	}


	public Random getRandom() {
		return random;
	}


	public void setRandom(Random random) {
		this.random = random;
	}


	@Override
	public String toString() {
		return "Character [filamax=" + filamax + ", columnamax=" + columnamax + ", random=" + random + "]";
	}

	
}
