package newProject;

import java.util.Scanner;

public class zigzagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		int count = 0;
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < b; j++, count++)
			{
				if(i%2==0)
				{
					arr[i][j] = count;
				}
				else
				{
					arr[i][b-1-j] = count;
				}
						
			}
		}
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < b; j++, count++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
