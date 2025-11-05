package com;

public class Vehicle 
{
		private String brand;
		private String color;
		private String vechilNum;
		private long chasiNum;
		private int numOfVeels;
		public Vehicle() {
			
		}
		public Vehicle(String brand, String color, String vechilNum, long chasiNum, int numOfVeels) {
			
			this.brand = brand;
			this.color = color;
			this.vechilNum = vechilNum;
			this.chasiNum = chasiNum;
			this.numOfVeels = numOfVeels;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getVechilNum() {
			return vechilNum;
		}
		public void setVechilNum(String vechilNum) {
			this.vechilNum = vechilNum;
		}
		public long getChasiNum() {
			return chasiNum;
		}
		public void setChasiNum(long chasiNum) {
			this.chasiNum = chasiNum;
		}
		public int getNumOfVeels() {
			return numOfVeels;
		}
		public void setNumOfVeels(int numOfVeels) {
			this.numOfVeels = numOfVeels;
		}
		
	}

