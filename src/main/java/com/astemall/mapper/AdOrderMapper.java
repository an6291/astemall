package com.astemall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.astemall.domain.OrderVO;
import com.astemall.dto.AdOrderDetailDTO;
import com.astemall.dto.Criteria;

public interface AdOrderMapper {

	// 주문 목록 
	List<OrderVO> order_list(@Param("cri") Criteria cri, @Param("startDate") String startDate, @Param("endDate") String endDate);
	// 주문 수
	int order_count(@Param("cri") Criteria cri, @Param("startDate") String startDate, @Param("endDate") String endDate);
	
	// 주문 상세
	List<AdOrderDetailDTO> order_detail(Long ord_no);
	
	// 주문 상세 - 상품 삭제(
	void order_de_prd_delete(@Param("ord_no")Long ord_no, @Param("prd_no")int prd_no);
	
	// 주문정보 업데이트
	//void updateOrder(Long ord_no, int ord_tot_price);
}
