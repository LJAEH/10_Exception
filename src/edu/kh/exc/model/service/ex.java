package edu.kh.exc.model.service;

import java.io.IOException;

public class ex {
	
	private static void methodA() {
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {

		try {
			methodA();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
		public void methodA() throws IOException {
			methodB();
		}
		public void methodB() throws IOException {
			methodC();
		}
		public void methodC() throws IOException {
			throw new IOException();
			// IOException 강제 발생
		}

	}
}
