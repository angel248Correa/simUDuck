package simUDuck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observer;

public class Observable implements QuackObservable {
	List<Observer> observers = new ArrayList<Observer>();
	
	 QuackObservable duck; 
	 
	  public Observable(MallardDuck mallardDuck) {
		// TODO Auto-generated constructor stub
	}

	public void Observable(QuackObservable duck) { 
		   this.duck = duck; 
	  }

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void notifyObserver() {
		 Iterator iterator = observers.iterator();
		 
		 while(iterator.hasNext()) { 
			 Object observer = iterator.next(); 
			 Observer.update(duck);
		 }
		
	}

}
