

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1
{
	public Mnozina[] mnoziny;

	public Test1()
	{

	}

	@Before
	public void setUp()
	{
		ml = new Mnozina( "ml" );
		ml.pridejPrvek( 5 );
		ml.pridejPrvek( 4 );
		ml.pridejPrvek( 7 );
		ml.pridejPrvek( 8 );
	}

	@After
	public void tearDown()
	{
		
	}
}
