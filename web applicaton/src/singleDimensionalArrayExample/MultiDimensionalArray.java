package singleDimensionalArrayExample;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dataType arrayName[][]=new dataType[][];
		
		String a[][]=new String[2][2];
		a[0][0]="selenium";
		a[0][1]="livetech";
		a[1][0]="QTP";
		a[1][1]="loadrunner";
		
		//System.out.println(a[1][0]);
		//System.out.println(a[0][1]);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
	}
	

}
