package com.luckyGirls.ForYourNutrition.dto.response;

import com.luckyGirls.ForYourNutrition.domain.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ItemGetResponse {
	private String name;

	private int price;

	private String detail;

	private int stock;

	private int category;

	private int target;

	private int effect;

	private int sales;

	//private String img;

	public static ItemGetResponse from(Item item) {
		return new ItemGetResponse(
			item.getName(),
			item.getPrice(),
			item.getDetail(),
			item.getStock(),
			item.getCategory(),
			item.getTarget(),
			item.getEffect(),
			item.getSales()
		);
	}
}
