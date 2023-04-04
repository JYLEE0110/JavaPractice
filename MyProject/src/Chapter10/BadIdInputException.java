package Chapter10;

public class BadIdInputException extends Exception {

	public BadIdInputException() {
		super("영문자와 숫자로만 입력하세요");
	}
}
