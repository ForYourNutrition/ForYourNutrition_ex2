package com.luckyGirls.ForYourNutrition.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luckyGirls.ForYourNutrition.dao.jpa.repository.IRecommendJpaRepository;
import com.luckyGirls.ForYourNutrition.dao.jpa.repository.ItemJpaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class IRecommendService {
	private static ItemJpaRepository itemJpaRepository;
	private static IRecommendJpaRepository iRecommendJpaRepository;
}
