package com.register.memberporta.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;


import com.register.memberporta.exception.ResourceNotFoundException;
import com.register.memberporta.model.MemberDetails;
import com.register.memberporta.repository.MemberPortalRepository;


public class MemberPortalServiceImpl implements MemberPortalService {
	
	@Autowired
	private MemberPortalRepository memberPortalRepository;
	
	
	@Override
	public MemberDetails createProduct(MemberDetails product) {
		return memberPortalRepository.save(product);
	}

	@Override
	public MemberDetails updateProduct(MemberDetails product) {
		Optional<MemberDetails> productDb = this.memberPortalRepository.findById(product.getId());
		
		if(productDb.isPresent()) {
			MemberDetails productUpdate = productDb.get();
			productUpdate.setId(product.getId());
			productUpdate.setName(product.getName());
			productUpdate.setAddress(product.getAddress());
			productUpdate.setState(product.getState());
			productUpdate.setCountry(product.getCountry());
			productUpdate.setPhoneno(product.getPhoneno());
			productUpdate.setEmailid(product.getEmailid());
			productUpdate.setPan(product.getPan());
			memberPortalRepository.save(productUpdate);
			return productUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + product.getId());
		}		
	}

	@Override
	public List<MemberDetails> getAllProduct() {
		
		
		return this.memberPortalRepository.findAll();
	}

	@Override
	public MemberDetails getProductById(long productId) {
		
		Optional<MemberDetails> productDb = this.memberPortalRepository.findById(productId);
		
		if(productDb.isPresent()) {
			return productDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + productId);
		}
	}

	@Override
	public void deleteProduct(long productId) {
		Optional<MemberDetails> productDb = this.memberPortalRepository.findById(productId);
		
		if(productDb.isPresent()) {
			this.memberPortalRepository.delete(productDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + productId);
		}
		
	}

}
