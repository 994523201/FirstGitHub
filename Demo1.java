package ShuZu;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		int[][] scores=new int[2][2];
		for(int i=0;i<scores.length;i++){
			System.out.println("********************��"+(i+1)+"����********************");
			for(int j=0;j<scores[i].length;j++){
				System.out.print("�������"+(j+1)+"��ѧ���ĳɼ�:");
				scores[i][j]=input.nextInt();
			}
		}
		System.out.println("******************�ɼ�ͳ��******************");
		for(int i=0;i<scores.length;i++){
			sum=0;
			for(int j=0;j<scores[i].length;j++){
				sum+=scores[i][j];
			}
			System.out.println(+(i+1)+"���ܳɼ�Ϊ:"+sum);
		}
		
	}
}
