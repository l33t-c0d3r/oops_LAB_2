class Calc
	{
		public static void main(String args[])
		{
			int a,b;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[2]);
			if (args[1]=="+")
				System.out.println((a+b));
			else if (args[1]=="-")
                                System.out.println((a-b));
                        else if (args[1]=="*")
                                System.out.println((a*b));
                        else if (args[1]=="/")
			{	if (b==0)
					System.out.println("Wrong Input");
				System.out.println((a/b));
			}
		}
	}


