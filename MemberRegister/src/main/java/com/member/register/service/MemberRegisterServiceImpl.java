package com.member.register.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.register.entity.MemberDetails;
import com.member.register.exception.ResourceNotFoundException;
import com.member.register.repository.MemberRegisterRepository;



@Service
public class MemberRegisterServiceImpl implements MemberRegisterService {
	
		
		Logger logger = LoggerFactory.getLogger(this.getClass());

		
		@Autowired
		private MemberRegisterRepository memberRepository;
		
		
		@Override
		public MemberDetails createProduct(MemberDetails product) {
			return memberRepository.save(product);
		}

		@Override
		public MemberDetails updateProduct(MemberDetails product) {
			Optional<MemberDetails> productDb = this.memberRepository.findById(product.getId());
			
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
				memberRepository.save(productUpdate);
				return productUpdate;
			}else {
				throw new ResourceNotFoundException("Record not found with id : " + product.getId());
			}		
		}

		@Override
		public List<MemberDetails> getAllProduct() {
			
			logger.info("fetching all the registered details");
			
			return this.memberRepository.findAll();
		}

		@Override
		public MemberDetails getProductById(long productId) {
			
			Optional<MemberDetails> productDb = this.memberRepository.findById(productId);
			
			if(productDb.isPresent()) {
				return productDb.get();
			}else {
				throw new ResourceNotFoundException("Record not found with id : " + productId);
			}
		}

		@Override
		public void deleteProduct(long productId) {
			Optional<MemberDetails> productDb = this.memberRepository.findById(productId);
			
			if(productDb.isPresent()) {
				this.memberRepository.delete(productDb.get());
			}else {
				throw new ResourceNotFoundException("Record not found with id : " + productId);
			}
			
		}

	}


	
	
	
	

	