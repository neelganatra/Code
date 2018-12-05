public class P7	
{
	public static void main(String arg[])
	{
		int sc=5, ss=6, lucky, lc, i;

			for(i=0; i<sc; i++)
			{
				int l1=0, l2=0, l3=0, l4=0, l5=0, l6=0;

				lucky=0;
				lc=0;

				while(lc<ss)
				{
					lucky=(int)((49*Math.random()+1));

					switch(lc)
					{
						case 0:	l1=lucky;
							lc++;
							break;
							
						case 1:	if(lucky!= l1)
							{
							l2= lucky;
							lc++;}
							break;
						
						case 2:	if(lucky!=l1 && lucky!= l2)
							{  l3=lucky;
							lc++;}
							break;

						case 3: 	if(lucky!=l1 && lucky!=l2 && lucky!=l3)
							{  l4=lucky;
							lc++;}
							break;

						case 4: 	if(lucky!=l1 && lucky!=l2 && lucky!=l3 && lucky!=l4)
							{   l5=lucky;
							lc++;}
							break;
	
						case 5:	if(lucky!=l1 && lucky!=l2 && lucky!=l3 && lucky!=l4 && lucky!=l5)
							{   l6=lucky;
							lc++;}
							break;

						}
					}
				System.out.print("\nSet "  +  (i + 1) +  ":");

				System.out.print(" " + l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5 + " " + l6);

			}
		}
	}
