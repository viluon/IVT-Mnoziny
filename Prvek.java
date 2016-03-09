
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

	public void setDalsiPrvek( Prvek p )
	{
		this.dalsiPrvek = p;
	}

	// WARN: Mimo zadani: Prida novy Prvek do rady *za* this Prvek
	public void pridejPrvek( int h )
	{
		Prvek p = new Prvek( h );
		p.setDalsiPrvek( this.dalsiPrvek );
		this.dalsiPrvek = p;
	}
}
