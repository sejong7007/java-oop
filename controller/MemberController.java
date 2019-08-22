package com.bitcamp.controller;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
//import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberController {
	
	public static void main(String[] args) {

		//MemberBean memberBean = new MemberBean();
		//MemberService memberService = new MemberService();
		MemberService service = new MemberService();
		MemberBean member = null;
		
		
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료   \n"
					+ "1.회원가입 \n"
					+ "2.마이페이지 \n"
					+ "3.비번수정 \n"
					+ "4.회원탈퇴\n"
					+ "5.회원목록\n"
					+ "6.아이디검색")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			
			case "1":
				//MemberBean member = new MemberBean();
				String spec = JOptionPane.showInputDialog("아이디, 비밀번호, 이름, 주민번호,생년월일,성인여부, 키, 몸무게, 혈액형");
				member = new MemberBean();
				//System.out.println("******************"+ spec);
				String[] arr = spec.split(","); //spec.split("/")도 사용가능 ""사이에 있는 것은 구분자
				member.setId(arr[0]);
				member.setPw(arr[1]);
				member.setName(arr[2]);
				member.setSnn(arr[3]);
				member.setBirth(arr[4]);
				member.setAdult(arr[5]);
				member.setHeight(Double.parseDouble(arr[6]));
				member.setWeight(Double.parseDouble(arr[7]));
				member.setBlood(arr[8]);
				
				JOptionPane.showMessageDialog(null, service.join(member));
				
				break;
			
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			
			case "3":
				
				break;
			
			case "4":
				
				break;
			
			case "5":
				JOptionPane.showMessageDialog(null, service.list());
				break;

			case "6":
				String serchId = JOptionPane.showInputDialog("검색 ID");
				member = service.findById(serchId);
				JOptionPane.showMessageDialog(null, member);
				break;
				
			default:
				break;
			}
		}
		
	}

}
