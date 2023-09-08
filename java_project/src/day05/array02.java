package day05;

public class array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50 사이의 랜덤값을 저장한 후 출력
		 */
		
		int arr[] = new int [5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*50)+1;
			System.out.println("랜덤 값 : "+ arr[i]);
		}
		System.out.println();
		
		
		//정렬(오름차순)
		//이중 for문 필요
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {	//오름차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//향상된 for문
		System.out.println();
		System.out.println("향상된 for >");
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		
	}

}
