package com.example.domain;

public class Phone {
        private int phoneId;
        private String phoneNum;
		public int getPhoneId() {
			return phoneId;
		}
		public Phone() {
			super();
		}
		public void setPhoneId(int phoneId) {
			this.phoneId = phoneId;
		}
		public String getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		@Override
		public String toString() {
			return "Phone [phoneId=" + phoneId + ", phoneNum=" + phoneNum + "]";
		}
}
