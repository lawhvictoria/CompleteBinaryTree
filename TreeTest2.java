import java.util.Scanner;

public class TreeTest2 {

        public static void main(String[] args)
        {
                Integer[] arr = new Integer[21];
                int N = 0;
                Scanner scan = new Scanner(System.in);
		boolean quit = false;
                System.out.println("Please input elements of the tree");
                int index;
                while(scan.hasNextInt() && N < 20)
                {
                        index = N + 1;
                        String input = scan.next();

			switch(input)
			{
				case "q":
					quit = true;
					TreeWork.printTree(arr, N);
					break;
					
				default:
                        		arr[index] = Integer.parseInt(input);
                        		N++;
                        		index++;
             
                		if(TreeWork.isHeap(arr, N))
                		{
                        		System.out.println("IS a heap");
				        System.out.println();
                			TreeWork.printTree(arr, N);
                			System.out.println();
					break;
                		}
                		else
                		{
                        		System.out.println("is NOT a heap");
					System.out.println();
			                TreeWork.printTree(arr, N);
                			System.out.println();
                		}
				break;
			}
		}
	}
}		
