package com.ncs.green.test;
//테스트
import com.ncs.green.service.VOService;
import com.ncs.green.vo.MemberVO;

public class VOServiceTest {

	public static void main(String[] args) {
		// 1) MemberVO 생성
		MemberVO vo = new MemberVO(); 
		vo.setId("banana");
		vo.setPassword("12345!");
		vo.setName("홍길동");
		vo.setAge(100);
		
		// 2) 직접 사용 출력
		System.out.println("** 직접 출력 =>"+vo);
		
		// 3) VOService 를 이용한 출력
		// => VOService 생성
		VOService service = new VOService();
		service.setMemberVO(vo);
		System.out.println("** AntBuild **");
		System.out.println("** VOService 출력 =>"+service.getMemberVO());
		
		System.out.println("** commit Test code 추가함");
	}//main
} //class

