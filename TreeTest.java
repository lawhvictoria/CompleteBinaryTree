import java.util.Scanner;

public class TreeTest {

	public static void main(String[] args)
	{
		Integer[] arr = new Integer[21];
		int N = 0;
//		TreeWork t = new TreeWork(20);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input elements of the tree");
		int index;
		while(scan.hasNextInt() && N < 20)
		{
			index = N + 1;
			String input = scan.next();
			arr[index] = Integer.parseInt(input);
			N++;			
			index++;
		}
//		if(arr == null)
//		{
//			System.out.println("The tree is empty!");
//		}
		if(TreeWork.isHeap(arr, N))
		{
			System.out.println("IS a heap");
		}
		else
		{
			System.out.println("is NOT a heap");
		}
		System.out.println();
		TreeWork.printTree(arr, N);
		System.out.println();
	}
}
