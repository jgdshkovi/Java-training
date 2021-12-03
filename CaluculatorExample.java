class CaluculatorExample{
			int empids[]={1,2,3,4,5,7,8};//index--->0 sop(empids[2])
			int empSalary=12000;
			static float marks=120.8f;
			
			int addOfTwo(int a,int b)
			{
			return a+b;
			}
		static void subOfTwo(int a,int b)
			{
			System.out.println("sub of two numbers :"+(a-b));
			}
			void mulOfTwo()
			{
			int a=20;
			int b=30;
			System.out.println("sub of two numbers :"+(a*b));
			}
			
			int divOfTwo()
			{
				int a=12;
				int b=6;
			return a/b;
			}
				public static void main(String args[])//89 90 89000.56 sandeep
				{
					int a=Integer.parseInt(args[0]);
					int b=Integer.parseInt(args[1]);
					float c=Float.parseFloat(args[2]);
					String name=args[3];
					System.out.println("salary :"+c+"  "+name);
					CaluculatorExample.subOfTwo(a,b);
					CaluculatorExample obj=new CaluculatorExample();
					int result=obj.addOfTwo(23,24);
					System.out.println("add of two numbers :"+result);
					System.out.println("div of two numbers :"+obj.divOfTwo());
					obj.mulOfTwo();
				}
			}