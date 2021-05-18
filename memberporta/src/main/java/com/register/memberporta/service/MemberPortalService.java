package com.register.memberporta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.register.memberporta.model.MemberDetails;


@Service
public interface MemberPortalService {
	
	MemberDetails createProduct(MemberDetails product);

	MemberDetails updateProduct(MemberDetails product);

	List<MemberDetails> getAllProduct();

	MemberDetails getProductById(long productId);

	void deleteProduct(long id);
}

