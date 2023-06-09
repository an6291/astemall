package com.astemall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astemall.domain.OrderVO;
import com.astemall.dto.AdOrderDetailDTO;
import com.astemall.dto.Criteria;
import com.astemall.mapper.AdOrderMapper;

import lombok.Setter;

@Service
public class AdOrderServiceImpl implements AdOrderService {

	@Setter(onMethod_ = {@Autowired})
	private AdOrderMapper adOrderMapper;

	@Override
	public List<OrderVO> order_list(Criteria cri, String startDate, String endDate) {
		return adOrderMapper.order_list(cri, startDate, endDate);
	}

	@Override
	public int order_count(Criteria cri, String startDate, String endDate) {
		return adOrderMapper.order_count(cri, startDate, endDate);
	}

	@Override
	public List<AdOrderDetailDTO> order_detail(Long ord_no) {
		return adOrderMapper.order_detail(ord_no);
	}

	@Override
	public void order_de_prd_delete(Long ord_no, int prd_no) {
		adOrderMapper.order_de_prd_delete(ord_no, prd_no);
	}
	
}
