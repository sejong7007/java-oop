package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;
/**
 * 요구사항(기능정의)
 * [사용자 기능]
 * 1. 회원가입 (Join)
 * 2. 마잎이지에서 회원정보를 볼 수 있도록 한다.
 * 3. 비번을 수정하는 기능
 * 4. 회원탈퇴 기능
 * =================================
 * [관리자 기능]
 * 5. 회원목록 조회 기능
 * 6. 아이디 검색
 * */

public class MemberService {
	
	private MemberBean[] members ;
	private int count;
	
	public MemberService() {
		members = new MemberBean[3];
		count =0;
	}
	
	/**
	 * 1.회원가입
	 * */
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	
	/**
	 * 2.마이페이지 
	 */
	 public String getMyPage(MemberBean param) {
		 String msg = param.toString() ;
			
		return msg;
	 }
	 
	/**
	 * 3.비번수정 
	 */
	 public String changePassword(MemberBean param) {
		 String msg = "비번이 수정되었습니다.";
			
		return msg;
	 }
	
	/**
	* 4.회원탈퇴 
	*/
	public String withDrwall(MemberBean param) {
		 String msg = "회원 탈퇴가 완료되었습니다.";
				
		return msg;
	}
		
	/**
	 * 5.회원목록 
	 */
	public String list() {
		String msg = "";
		for(int i=0 ; i <count ; i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	}
	
	/**
	 * 6.아이디 검색 
	 */
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		
		for(int i=0 ; i<count ; i++) {
			if(id.equals(members[i].getId())) {
				member = members[i];
			}
		}

		return member;
		
	}
	
	
	
	
	
	
	
	public String getBmi(MemberBean memberBean) {
		String result = "";
		double bmi = memberBean.getWeight() / (memberBean.getHeight() * memberBean.getHeight() * 0.0001) ;
		String bmieval = "";
		if (bmi > 30) {
			bmieval = "고도비만";
		}else if(bmi > 28) {
			bmieval = "비만";
		}else if(bmi > 25) {
			bmieval = "과체중";
		}else if(bmi >18) {
			bmieval = "정상";
		}else {
			bmieval = "저체중";
		}
		result = String.format("%d님은 %d 입니다.", memberBean.getName(),bmieval);
		return result;
	}

	
	
}
