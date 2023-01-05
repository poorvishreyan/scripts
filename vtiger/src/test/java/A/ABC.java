package A;

class ABC 
{
	
		public static void main(String[] args)
		{
		int[] a = {50,30,10,20,40, 60};

		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;i<a.length;j++)
		{
		if(a[i]<a[j])
		{

		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}

		int sum=0;
		for(int i=3;i<6;i++)
		{
		
			sum=sum+a[i];
			System.out.println(a[i]);
		}
		System.out.println("sum is:" +sum);

}
		}
		
		
		
