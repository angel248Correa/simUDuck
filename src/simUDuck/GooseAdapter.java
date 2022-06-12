package simUDuck;

public class GooseAdapter implements Quackable {
Goose goose; 

public GooseAdapter(Goose goose) { 
	this.goose = goose; 
}
	
	@Override
	public void quack() {
		goose.honk();
	}
		public String toString() { 
			 return "Goose protending to be a duck"; 
		}
}
