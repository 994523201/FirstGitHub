package ShuZu;

public class Choose {
	public static void main(String[] args) {
		int[] arr={4,9,3,1,7};
		int min=-1;//��Сֵ�±�
		//���:�Ƚϼ��֣�ÿһ�ֱȳ���Сֵ
		for(int i=0;i<arr.length-1;i++){
			min=i;//ÿ��min��ʼֵ
			//�ڲ㣺��ǰԪ�غͺ����Ԫ�رȽϣ���¼���µ���СԪ���±�
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			//���minֵ�����˱仯��˵�������˸�С��ֵ����ǰֵ�͸�С��ֵ��������֤Сֵ��������ǰ��
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
