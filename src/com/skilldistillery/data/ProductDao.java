package com.skilldistillery.data;

import java.util.List;

public interface ProductDao {

	List<Integer> MakeLotteryBalls(int numBalls, int maxNum);
	public int getNumBalls(int numBalls);
	public int getMaxNum(int maxNum);
	

}
