package com.astemall.service;

import java.util.List;

import com.astemall.domain.OrderVO;
import com.astemall.dto.AdOrderDetailDTO;
import com.astemall.dto.Criteria;

public interface AdOrderService {
	
	// 주문 목록
	List<OrderVO> order_list(Criteria cri, String startDate, String endDate);
	// 주문 수
	int order_count(Criteria cri, String startDate, String endDate);
	
	// 주문 상세
	List<AdOrderDetailDTO> order_detail(Long ord_no);
	
	// 주문 상세 - 상품 삭제
	void order_de_prd_delete(Long ord_no, int prd_no);

}
