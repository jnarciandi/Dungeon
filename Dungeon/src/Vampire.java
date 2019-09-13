

public class Vampire extends Character {
	
	private String form;
	private int fila;
	private int columna;
	
	public Vampire(int fila, int columna) {
		super(fila,columna);
		this.form = ("v");
		this.fila = random.nextInt(filamax);
		this.columna = random.nextInt(columnamax);
	}
	
	
	public void move() {
		int direction = random.nextInt(2)+1;
		if (direction == 1) {
			this.fila = random.nextInt(filamax);
		}else if (direction == 2) {
			this.columna = random.nextInt(columnamax);
		}
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
		return ("v " + this.columna + " " + this.fila);
	}

	
}
