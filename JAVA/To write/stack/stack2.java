class stack2 
{
	public static void main(String[] args) 
	{
		Stack s= new Stack();
		System.out.println("*****Welcome to stack implementation!*****");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose operation");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		int ch=br.readLine();
		switch (ch)
		{
		case 1:s.push();
		case 2:s.pop();
		case 3:
		}
	}
}
