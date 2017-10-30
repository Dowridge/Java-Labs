public class HourlyPay implements Payroll
{
  private double hours, payRate;

  public HourlyPay()
  {
    hours = 40;
    payRate = 10;
  }
  
  public HourlyPay(int h, int p)
  {
    hours = h;
    payRate = p;
  }

  private double getOverTime()
  {
    if( hours > 40)
    return 1.5 * (hours - 40) * payRate;

    else 
    return 0;
  }

  public double getGrossPay()
  {
    return ( (hours * payRate) + getOverTime() );
  }

  public double getDeductions() 
  {
    return ( TAXRATE * getGrossPay() );
  }

  @Override
  public String toString()
  {
  
   String st = String.format("\nPay Rate:\t%.2f\nHours:\t\t%.2f\nOvertime:\t%.2f\nGross Pay:\t%.2f\nTax Deduction:\t%.2f\nNet Pay:\t%.2f",
  payRate, hours, getOverTime(), getGrossPay(), getDeductions(),  getGrossPay() - getDeductions() );
  return( st );
  }
  

public void printDetails()
{
System.out.print(this);
}



  
}
