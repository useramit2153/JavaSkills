
public class Bank_ABC extends Bank{
	@Override								
	int getInterestRate() {				//Method is override
		return 5;
	}
	int getInterestRate(int x) {		//Method is overloading
		return 3;
	}
	@Override
	void display() {
		super.display();
	}
}
