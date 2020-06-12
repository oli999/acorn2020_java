package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0 으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums 에 담기 
		int[] nums= { 0, 0, 0};
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		// 0 으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums2 에 담기 
		int[] nums2=new int[3];
		nums2[0]=100;
		nums2[1]=200;
		nums2[2]=300;
		//nums2[3]=400; // ???  없는 방번호를 참조 하면 Exception 이 발생한다.
		
		System.out.println("마무리 작업을 하고 app 을 종료 합니다.");
	}
}





