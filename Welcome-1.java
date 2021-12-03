	class Welcome{
		short salary=29000;//global& instance
		static String organame="FisGlobal";//global & static
		public static void main(String args[])
		{
			System.out.println("leave use we are feeling hungry");
			byte age=119; //local
			double marks=89.78902394829304823094823;
			boolean value=false;
			char gender='M';
			System.out.println(age+" :"+marks +"  "+value+" "+gender);
			System.out.println(Welcome.organame);
			Welcome wel=new Welcome();
			System.out.println(wel.salary);
		}
		
		}