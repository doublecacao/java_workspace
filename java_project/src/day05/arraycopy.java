package day05;

public class arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* arraycopy : 배열 복사
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 늘이거나 줄일수 없음.
		 * 이후 추가/삭제 불가능.
		 * 배열의 길이를 늘이거나 줄이고 싶을 경우 배열 복사를 통해
		 * 길이를 조절.
		 */
		int arr[] = new int [3];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//수동으로 배열을 복사
		int arr1[] = new int[5];
		
		//arraycopy를 이용
		System.arraycopy(arr, 0, arr1, 1, arr.length-1);
		
//		for(int i=0; i<arr.length; i++) {
//			arr1[i] = arr[i];
//		}
		
		for(int tmp : arr1) {
			System.out.print(tmp+ " ");
		}
		System.out.println();
		/* 3개의 값을 담을 수 있는 String 배열 생성 후
		 * 국어, 영어, 수학 글자를 담은 후 출력 (향상된 for문으로 출력)
		 * 
		 * 
		 * 5개의 값을 담을 수 있는 String 배열 생성 후
		 * 사회, 과학을 추가하여 향상된 for문으로 출력
		 */
		
		String arr3[] = new String [3];
		arr3[0] = "국어";
		arr3[1] = "영어";
		arr3[2] = "수학";
		
		
		for(String tmp : arr3) {
			System.out.print(tmp+" ");
		}
		
		String arr2[] = new String[5]; 
		arr2[3] = "사회";
		arr2[4] = "과학";
		
		System.arraycopy(arr3, 0, arr2, 0, arr3.length);
		for(String tmp: arr2) {
			System.out.print(tmp+" ");
		}
		
	
	}

}
