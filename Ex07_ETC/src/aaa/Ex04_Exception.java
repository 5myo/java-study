package aaa;

import java.io.File;
import java.io.IOException;

import kr.or.bit.ExClass;

public class Ex04_Exception {
public static void main(String[] args) {
	try {
		ExClass ex = new ExClass("Temp");
	} catch (NullPointerException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
