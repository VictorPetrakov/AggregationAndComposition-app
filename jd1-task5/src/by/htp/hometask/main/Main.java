package by.htp.hometask.main;


import by.htp.hometask.bean.Voucher.Cruise;
import by.htp.hometask.bean.Voucher.Excursion;
import by.htp.hometask.bean.Voucher.Shopping;

import by.htp.hometask.logic.VoucherLogic;

public class Main {

	public static void main(String[] args) {
		
		
		VoucherLogic logic = new VoucherLogic();
		
		
		System.out.println();
		
		logic.findByTransport("Поезд");
		
		System.out.println();
		
		logic.findByFood("Все включено");
		
		System.out.println();
		
		logic.findByDays(14);
		
		System.out.println();
		
		logic.sortVoucher(Shopping.values());
		
		System.out.println();
		
		logic.sortVoucher(Cruise.values());
		
		System.out.println();
		
		logic.choiсeTypeOfVaucher(Excursion.values());
		
	

	}

}
