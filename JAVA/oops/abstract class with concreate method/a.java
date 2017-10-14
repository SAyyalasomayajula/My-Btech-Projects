abstract class animal
{
          abstract void speek();

	  void eat()
	  {
	         System.out.println("animal eating grass");
	  }
}


class goat extends animal
{
	    void speek()
	    {
		       System.out.println("goat speeking ma........ma");
		}
}


class cow extends animal
{
	void speek()
	{
	       System.out.println("cow speeks ambaa.........ambaa...");
	}
}

class demo
{
	public static void main(String ... args)
	{
	       goat g=new goat();
		   g.speek();
		   g.eat();

		   cow c=new cow();
		   c.speek();
		   c.eat();
	}
}
