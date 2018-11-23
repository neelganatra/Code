public class floating_point {
	public static void main(String args[])
     {
	double inc =5000.250, tax,Rs;
	int taxRs, taxpaisa;
	tax =(float)(inc*35);
	System.out.println("Tax in dollars"+tax);
	Rs =(float)(tax*71.25);
	taxRs =(int)(Rs);
	System.out.println("Tax in Rs"+taxRs);
	taxpaisa=(int)((Rs-taxRs)*100);
	System.out.println("Tax in paisa"+taxpaisa);
        }
}	