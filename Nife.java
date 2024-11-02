class SBI
{
	SBI(String name,float amount,int pho)
	{
		System.out.println(name);
		System.out.println(amount);
		System.out.println(pho);
		System.out.println();
	}
	
}

class IOB extends SBI
{
	IOB(String Name,float Amount,int Pho)
	{
		super("Visal",450000,998989090);	//  -> Connect to the SBI
		System.out.println(Name);
		System.out.println(Amount);
		System.out.println(Pho);
	}
}

class Indian extends IOB
{
	Indian()
	{
		super("Kavin",20000,990099889);		// -> Connect to the IOB
		System.out.println();
	}
}

class Nife
{
	public static void main(String rg[])
	{
		new Indian();
	}
}