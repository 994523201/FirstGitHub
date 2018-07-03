package ShuZu;

public class Choose {
	public static void main(String[] args) {
		int[] arr={4,9,3,1,7};
		int min=-1;//最小值下标
		//外层:比较几轮，每一轮比出最小值
		for(int i=0;i<arr.length-1;i++){
			min=i;//每轮min初始值
			//内层：当前元素和后面的元素比较，记录最新的最小元素下标
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			//如果min值发生了变化，说明发现了更小的值，则当前值和更小的值交换，保证小值放在数组前面
			if(min!=i){
				int temp=arr[min];//min=3 temp=3
				arr[min]=arr[i];//i=0 min=0
				arr[i]=temp;//temp=3 i=3
			}
		}
		for(int num:arr){
			System.out.print(num+"\t");
		}
	}

}
