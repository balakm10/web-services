package com.ws;

import java.rmi.RemoteException;

import com.ws.FirstWSStub.AddTwoNumbers;
import com.ws.FirstWSStub.AddTwoNumbersResponse;

public class FirstWSClient {

	public static void main(String[] args) throws RemoteException {

		FirstWSStub firstWSStub = new FirstWSStub();
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		addTwoNumbers.setA(100);
		addTwoNumbers.setB(200);
		AddTwoNumbersResponse addTwoNumbersResponse = firstWSStub.addTwoNumbers(addTwoNumbers);
		System.out.println("Result: " + addTwoNumbersResponse.get_return());

	}

}
