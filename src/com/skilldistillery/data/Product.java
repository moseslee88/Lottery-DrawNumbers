package com.skilldistillery.data;



public class Product {
	int numBalls;
	int maxNum;

	

	public int getNumBalls() {
		return numBalls;
	}
	public void setNumBalls(int numBalls) {
		this.numBalls = numBalls;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxNum;
		result = prime * result + numBalls;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (maxNum != other.maxNum)
			return false;
		if (numBalls != other.numBalls)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Number of Balls [balls=").append(numBalls).append(", Max. Range of Numbers=").append(maxNum).append("]");
		return builder.toString();
	}
	public Product(int productID, String name, double price) {
		super();
		this.numBalls = numBalls;
		this.maxNum = maxNum;
	}
	
	public Product() {	 }
}
