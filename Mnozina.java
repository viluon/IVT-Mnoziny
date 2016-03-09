
public class Mnozina
{
	private String oznaceni;
	private Prvek[] evidencePrvku;
	private int pocetPrvku;

	public Mnozina( String o )
	{
		this.oznaceni = o;
		this.evidencePrvku = null;
		this.pocetPrvku = 0;
	}

	public void pridejPrvek( int h )
	{
		if ( !this.evidencePrvku )
		{
			this.evidencePrvku = new Prvek[ 100 ];
			this.evidencePrvku[ 0 ] = new Prvek( h );
			this.pocetPrvku++;
		}
		else
		{
			Prvek p = new Prvek( h );
			Prvek posledniPrvek = this.evidencePrvku[ this.pocetPrvku - 1 ];
			posledniPrvek.setDalsiPrvek( p );
		}
	}
}
