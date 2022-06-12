package simUDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		
		DuckSimulator simulator = new DuckSimulator(); 
		
		AbstractDuckFactory duckFactory = new CountingDuckFactory(); 
		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall ();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose()); 
		
		System.out.println("\nDuck Simulator: with compositon - Flocks");
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardDuckone = duckFactory.createMallardDuck();
		Quackable mallardDucktwo = duckFactory.createMallardDuck();
		Quackable mallardDuckthree = duckFactory.createMallardDuck();
		Quackable mallardDuckfour = duckFactory.createMallardDuck(); 
		 
		flockOfMallards.add(mallardDuckone);
		flockOfMallards.add(mallardDucktwo);
		flockOfMallards.add(mallardDuckthree);
		flockOfMallards.add(mallardDuckfour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfMallards);
		
		
		
		System.out.println(" the duck quacked " + 
						QuackCounter.getQuack() + " times");
		 
		
	}
	void simulate(Quackable duck) { 
		duck.quack();
	}
}
