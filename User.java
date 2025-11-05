package com;


public class User 
{
		private String name;
		private int age;
		private long mobileNum;
		private String gender;
		private String location;
		private String fatherName;
		
		public User() {
			
		}
		public User(String name, int age, long mobileNum, String gender, String location, String fatherName) {
			this.name = name;
			this.age = age;
			this.mobileNum = mobileNum;
			this.gender = gender;
			this.location = location;
			this.fatherName = fatherName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getMobileNum() {
			return mobileNum;
		}
		public void setMobileNum(long mobileNum) {
			this.mobileNum = mobileNum;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getFatherName() {
			return fatherName;
		}
		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}
		public void userInfo()
		{
			System.out.println("Name : "+name);
			System.out.println("Mobile number :"+mobileNum);
			System.out.println("Age : "+age);
			System.out.println("Gender : "+gender);
			System.out.println("Loacation : "+location);
			System.out.println("Father Name : "+fatherName);
		}
	}


