package A;

public class snippet {

	public static void main(String[] args) {
		
		 int val[] = {1,5,8,6,7,3};
			boolean flag =false;
			for(int i=0;i<val.length;i++)
			{
				for(int j=i+1;j<val.length;j++)
				{
					if(val[i]+val[j]==15)
					{
						flag =true;
						System.out.println("sum is 15 " +val[i]+" "+val[j]);
						break;
					}
					
				}
				
			}
	}
}


