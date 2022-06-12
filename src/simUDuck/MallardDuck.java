package simUDuck;

import java.util.Observer;

public class MallardDuck implements Quackable{
	 Observable observable;
	 
	public void MallardDuck() { 
		
		observable = new Observable(this); 
		notifyObservavble(); 
	}

	public void notifyObservavble() {
		
	observable.notifyObserver();
		
	}
	
	public void registerObserver(Observer observer) { 
		observable.registerObserver(observer);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
			
	}

}
