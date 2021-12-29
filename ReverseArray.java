class ReverseArray
{
	public static void main(String args[])
	{
		int[] a={7,5,3,2,77};
		int l=a.length;
		System.out.println("Original Array :");	
		for(int i=0;i<l;i++)
		{
		 System.out.println(a[i]);
		}
		 System.out.println("Reversed Array :");
		  for(int j=l-1;j>=0;--j)
		{
		   System.out.println(a[j]);	 
					
		}
	}
}	