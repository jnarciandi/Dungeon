import java.util.ArrayList;

public class Player extends Character{
	private String form;
	private int fila;
	private int columna;
	
	public Player(int fila, int columna) {
		super(fila,columna);
		this.form = ("@");
		this.fila = 0;
		this.columna = 0;
	}
	
	

	
	public void move(ArrayList<Character> chars) {
		
	}


	public String getForm() {
		return form;
	}


	public void setForm(String form) {
		this.form = form;
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}
	@Override
	public String toString() {
		return ("@ " + this.columna + " " + this.fila);
	}
}
