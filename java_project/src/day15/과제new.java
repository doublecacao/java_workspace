package day15;

public class 과제new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fileName = {"java.txt","String.jpg","method.png","String.pdf","java.pdf"};
		String[] img = {"jpg","png","gif","jpeg"};
		System.out.println("--이미지 파일--");
		
		과제new ex = new 과제new();
		
		try {
			for(String tmpFile : fileName) {
				String search = tmpFile.substring(tmpFile.lastIndexOf(".")+1);
				if(ex.isContains(img, search)) {
					System.out.println(tmpFile);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	//isContains
	//배열에서 찾는 문자열이 있는지 체크 ture/false
	public boolean isContains(String arr[], String search) {
		if(arr==null || arr.length==0) {
			throw new RuntimeException("배열이 없습니다");
		}
		if(search==null) {
			throw new RuntimeException("검색어가 없습니다");
		}
		
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}
}
