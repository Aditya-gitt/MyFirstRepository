
public class Icici extends Calculation{
	private final static int LOANAMOUNT = 5;
	
	@Override
	public double getRateOfInterest(){
		return (loanAmount*rOI)/100;
	}
	
	public Icici(){
		rOI = 9.7;
		loanAmount = LOANAMOUNT;
	} 
}
