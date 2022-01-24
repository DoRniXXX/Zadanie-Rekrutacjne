package pl.app;

public class Main {

	public static void main(String[] args) {	
		Wall wall = new Wall(new Data().run());
		
		System.out.println(wall.count()); 
		System.out.println(wall.findBlockByColor(Colors.SILVER)); 
		System.out.println(wall.findBlocksByMaterial(Materials.REINFORCEDSTEEL)); 
		
	}

}
