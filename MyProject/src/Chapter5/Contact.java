package Chapter5;
import java.util.*;

public class Contact {
	
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String birth;
	private String group;
	
	public Contact() {
		
	}
	
//	public Contact(String name, String phonNum, String email, String address, String birth, String group) {
//		super();
//		this.name = name;
//		this.phoneNum = phonNum;
//		this.email = email;
//		this.address = address;
//		this.birth = birth;
//		this.group = group;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phonNum) {
		this.phoneNum = phonNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력 하세요 : ");
		name = scan.nextLine();
		
		System.out.print("전화번호를 입력 하세요 : ");
		phoneNum = scan.nextLine();
		
		System.out.print("이메일을 입력 하세요 : ");
		email = scan.nextLine();
		
		System.out.print("주소를 입력 하세요 : ");
		address = scan.nextLine();
		
		System.out.print("생일을 입력 하세요 : ");
		birth = scan.nextLine();
		
		System.out.print("그룹을 입력 하세요 : ");
		group = scan.nextLine();
		
		scan.close();
	}
	
	public void printData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + birth);
		System.out.println("그룹 : " + group);
	}
	
}
