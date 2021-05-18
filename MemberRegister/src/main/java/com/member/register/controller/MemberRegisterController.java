package com.member.register.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.member.register.entity.MemberDetails;

import com.member.register.service.MemberRegisterService;

@RestController

public class MemberRegisterController {
	@Autowired
	private MemberRegisterService memberService;
	
	@GetMapping("/products")
	public ResponseEntity<List<MemberDetails>> getAllProduct(){
		return ResponseEntity.ok().body(memberService.getAllProduct());
	}
	
	@GetMapping("/products/id")
	public ResponseEntity<MemberDetails> getProductById(@PathVariable long id){
		return ResponseEntity.ok().body(memberService.getProductById(id));
	}
	
	@PostMapping("/products")
	public ResponseEntity<MemberDetails> createProduct(@RequestBody @Valid MemberDetails product){
		return ResponseEntity.ok().body(this.memberService.createProduct(product));
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<MemberDetails> updateProduct(@PathVariable long id, @RequestBody MemberDetails product){
		product.setId(id);
		return ResponseEntity.ok().body(this.memberService.updateProduct(product));
	}

	@DeleteMapping("/products/{id}")
	public HttpStatus deleteProduct(@PathVariable long id){
		this.memberService.deleteProduct(id);
		return HttpStatus.OK;
	}
}
