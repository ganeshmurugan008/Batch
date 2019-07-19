
public class ArrayTwo {

	public static void main(String[] args) {

		int[] ar=new int[4];
		ar[0]=4;
		ar[1]=8;
		ar[2]=2;
		ar[3]=1;
		
		int a=ar.length;
		System.out.println("arrylength"+a);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		String[] st={"one","two","three","four","1","2"};
		
			for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
	
		}

}
