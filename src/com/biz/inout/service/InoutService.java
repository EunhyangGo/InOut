package com.biz.inout.service;

import java.util.Scanner;

import com.biz.inout.vo.InoutVO;

public class InoutService {
	
	InoutVO inoutVO;
	
	// 클래스의 생성자
	public InoutService() {
		inoutVO = new InoutVO();
		
	}

	public boolean makeInout() {
		boolean retOk = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜(19990101) >>");
		String strDate = scanner.nextLine();
		if(inoutVO.setStrDate(strDate) == false){
			System.out.println("날짜 형식이 잘못되었습니다.");
			return false;
		}
		
		System.out.println("구분(1:매입, 2:매출) >>");
		String strIO = scanner.nextLine();
		
		
		//inoutVO = new InoutVO();
		
		inoutVO.setStrIO(strIO);
		try {
			System.out.println("단가  >>");
			String strDanga = scanner.nextLine();
			inoutVO.setIntDanga(Integer.valueOf(strDanga));

			System.out.println("수량 >>");
			String strSu = scanner.nextLine();
			inoutVO.setIntSu(Integer.valueOf(strSu));
			
			System.out.println("부가세(1: 과세, 2:면세) >>");
			String strVat = scanner.nextLine();
			inoutVO.setVat(Byte.valueOf(strVat));
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
		
	}
}
