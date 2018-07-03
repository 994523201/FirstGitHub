package ShuZu;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		int[][] scores=new int[2][2];
		for(int i=0;i<scores.length;i++){
			System.out.println("********************第"+(i+1)+"个班********************");
			for(int j=0;j<scores[i].length;j++){
				System.out.print("请输入第"+(j+1)+"个学生的成绩:");
				scores[i][j]=input.nextInt();
			}
		}
		System.out.println("******************成绩统计******************");
		for(int i=0;i<scores.length;i++){
			sum=0;
			for(int j=0;j<scores[i].length;j++){
				sum+=scores[i][j];
			}
			System.out.println(+(i+1)+"班总成绩为:"+sum);
		}
		
	}
}
