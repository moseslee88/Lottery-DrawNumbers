package com.skilldistillery.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductDaoMemoryImpl implements ProductDao {
	private int Integer = 0;
	List <Integer> lotteryBalls = new ArrayList<>();
	List<LotteryBall> Hopper;

	@Override
	public List<LotteryBall> MakeLotteryBalls(int numBalls, int maxNum) {
		// TODO Auto-generated method stub
		Hopper = new ArrayList<>();
		for (int i = 0; i < numBalls; i++) {
			int x = (int)(Math.random()*maxNum);
			Hopper.add(new LotteryBall(x));
		}		
		Collections.shuffle(Hopper);
		return Hopper;
	}
	
	public ProductDaoMemoryImpl() {
		this.loadProducts();
	}

	public List<Integer> loadProducts() {
//		for (int i = 0; i < numBalls; i++) {
//			int index = (int)(Math.random()*Hopper.size()); 
//			Integer winner = Hopper.get(index);
//			lotteryBalls.add(winner);
//			lotteryBalls.remove(index);  //takes ball out of hopper so it is Not Replaced
//		}
		return lotteryBalls;
	}

	@Override
	public int getNumBalls(int numBalls) {
		// TODO Auto-generated method stub
//		Product lotteryProduct = new Product(numBalls, maxNum);
//		if (lotteryProduct != null) {
//			return lotteryProduct.getNumBalls();
//		} else {
//			return -1;
//		}
		return 0;
	}
	

	@Override
	public int getMaxNum(int maxNum) {
//		Product lotteryProduct = new Product(numBalls, maxNum);
//		if (lotteryProduct != null) {
//			return lotteryProduct.getMaxNum();
//		} else {
//			return -1;
//		}
		return 0;
	}
	

}


