
public class Hdfc extends Calculation {
	private final static int LOANAMOUNT = 5;
	
	@Override
	public double getRateOfInterest(){
		return (loanAmount*rOI)/100;
	}
	
	public Hdfc(){
		rOI = 7.3;
		loanAmount = LOANAMOUNT;
	} 
}
