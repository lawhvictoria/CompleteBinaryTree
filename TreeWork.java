public class TreeWork<T> {
	
	public static <T extends Comparable<? super T>> boolean isHeap(T[] arr, int N)
	{
		if(arr == null || N == 0)
		{
			return false;
		}
		if(N == 1)
		{
			return true;
		}
		for(int i = 2; i < N; i++)
		{
			if(arr[i].compareTo(arr[(int)Math.floor(i/2)]) < 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static <T> void printTree(T[] arr, int N)
	{
		int newL = 1;
		for(int i = 1; i <= N; i++)
		{
			System.out.print(arr[i] + " ");
			if(i == newL)
			{
				System.out.println();
				newL = (newL * 2) + 1;
			}
		}
		if(N == 0)
		{
			System.out.println("Tree is Empty");
		}
	}
}
