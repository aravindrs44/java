
public class Gorilla extends Mammal {
	public Gorilla() {
		
	}
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("This gorilla said 'yaYEET'");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		if(energyLevel > 100) {
			this.energyLevel = 100;
		}
		System.out.println("This gorilla is satisfied with the banana.");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("This gorilla scales Hunka Mountain!");
	}
}
