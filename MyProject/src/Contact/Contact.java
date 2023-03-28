package Contact;

public class Contact {

	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String birth;
	private String group;

	public Contact(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public Contact(String name, String phoneNum, String email, String address, String birth, String group) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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

	public void printsimpleData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
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
