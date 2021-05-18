package com.member.register.service;
import java.util.List;


import java.util.Optional;

import com.member.register.entity.MemberDetails;




public interface MemberRegisterService {
	
	MemberDetails createProduct(MemberDetails product);

	MemberDetails updateProduct(MemberDetails product);

	List<MemberDetails> getAllProduct();

	MemberDetails getProductById(long productId);

	void deleteProduct(long id);


}