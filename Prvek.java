
public class Prvek
{
	private int hodnotaPrvku;
	private Prvek dalsiPrvek;
	
	public Prvek( int h )
	{
		this.hodnotaPrvku = h;
		this.dalsiPrvek = null;
	}

	public Prvek getDalsiPrvek()
	{
		return this.dalsiPrvek;
	}
}
