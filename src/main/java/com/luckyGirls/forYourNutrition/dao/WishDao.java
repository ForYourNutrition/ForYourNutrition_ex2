package com.luckyGirls.forYourNutrition.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface WishDao {
	List<Item> getWishList(int member_id) throws DataAccessException; //위시리스트(찜) 조회
	
	void addItemToWishList(int member_id, int item_id) throws DataAccessException; //위시리스트(찜)에 상품 추가
	
	void deleteItemFromWishList(int member_id, int item_id) throws DataAccessException; //위시리스트(찜)에서 상품 삭제
}
