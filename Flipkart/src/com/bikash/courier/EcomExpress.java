package com.bikash.courier;

public class EcomExpress implements ICourier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "Order ID "+oid+" is given to EcomExpress ..";
	}

}
