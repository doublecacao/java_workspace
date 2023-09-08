package day15;


public class Exception06 {

	public static void main(String[] args) {
			Exception06 ex = new Exception06();
			 
		try {
			int[] a = ex.ran(10, 1, 10);	//size와 start 음수값 주기
			int[] c = new int[-1];			//음수 배열 만들기
			int[] b = ex.arr(null, 1, 10);	//null값 주기
			
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(int i=0; i<b.length; i++) {
				System.out.print(b[i]+" ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

	//메서드 생성
	/* 기능 : 배열의 길이가 주어지면 길이만큼 배열을 생성하여 배열을 돌려주는 메서드 (size, start, count)
	 * 		 배열안에 random값을 채워서 리턴 1~10 start=1, count=10
	 * 		 -size가 0보다 작다면 예외발생
	 * 		 -start가 0보다 작다면 예외발생
	 */
	public int[] ran(int size, int start, int count) {
		if(start<0) {
			throw new RuntimeException("start 예외발생");
		}
		if(size<0){
			throw new RuntimeException("size 예외발생");
		}
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*count)+start;
		}
		return arr;
	}
	
	/* 기능 : 배열을 받아서 배열에 랜덤값을 채우는 메서드 (arr, start, count)
	 * 		 -arr 배열이 null일 경우 예외발생
	 * 		 -arr 배열의 길이가 0보다 작을 경우 예외발생
	 */
	public int[] arr(int[] arr, int start, int count) throws Exception {
		if(arr==null) {
			throw new Exception("null값을 가리키는 예외발생");
		}
		if(arr.length<0) {
			throw new Exception("배열의 길이가 0보다 작습니다.");	//음수 배열 생성시, 앞에서 예외처리해서 구문이 실행안됌.
		}
		
		for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*count)+start;	
		}
		return arr;
	}
}

