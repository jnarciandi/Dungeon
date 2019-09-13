import java.util.ArrayList;

public class Utiles {
	
	public static void playerMove(Player player,String movs) {
		int i = 0;
		while (i<movs.length()){
			if(movs.charAt(i) == 'd' && player.getColumna() < player.getColumnamax()-1) {
				player.setColumna(player.getColumna()+1);
			}else if(movs.charAt(i) == 'a' && player.getColumna() > 0){
				player.setColumna(player.getColumna()-1);;
			}else if(movs.charAt(i) == 'w' && player.getFila() > 0) {
				player.setFila(player.getFila() -1);
			}else if(movs.charAt(i) == 's' && player.getFila() < player.getFilamax() -1) {
				player.setFila(player.getFila() +1);
			}
			i++;
		}
	}

	
	public static void killVampire(ArrayList<Character> chars, Player pla) {
		boolean comp = true;
		while (comp) {
		int count = 0;
		int test =0;
		for(Character a: chars) {
			if(a.getColumna() == pla.getColumna() && a.getFila() == pla.getFila() && a.getForm().contentEquals("v")) {
				test = count;
			}else if(a.getColumna() == pla.getColumna() && a.getFila() == pla.getFila() && a.getForm().contentEquals("D")) {
				System.out.println("¡El Conde Drácula te ha atrapado!");
				gameOver();
			}
			
			count++;
		}
		if (test != 0) {
			System.out.println("¡Has matado un vampiro!");
			chars.remove(test);
			}else if(test==0) {
			comp =false;
			}
		}
	}
	
	public static void gameOver() {
		System.out.println("Has perdido.");
		System.out.println("GAME OVER");
		System.exit(0);
	}
}
