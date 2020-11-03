
public class Sbi extends Calculation {
	private final static int LOANAMOUNT = 5;
	
	@Override
	public double getRateOfInterest(){
		return (loanAmount*rOI)/100;
	}
	
	public Sbi(){
		rOI = 8.4;
		loanAmount = LOANAMOUNT;
	} 
}
