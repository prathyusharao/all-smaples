package com.register.memberporta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.register.memberporta.model.MemberDetails;
import com.register.memberporta.service.MemberPortalService;

@RestController
public class MemberPortalController {
	
	@Autowired
	private MemberPortalService memberPortalService;
	
	
	@GetMapping("/portal")
	public ResponseEntity<List<MemberDetails>> getAllProduct(){
		return ResponseEntity.ok().body(memberPortalService.getAllProduct());
	}
	
	@GetMapping("/portal/id")
	public ResponseEntity<MemberDetails> getProductById(@PathVariable long id){
		return ResponseEntity.ok().body(memberPortalService.getProductById(id));
	}
	
	@PostMapping("/portal")
	public ResponseEntity<MemberDetails> createProduct(@RequestBody @Valid MemberDetails product){
		return ResponseEntity.ok().body(this.memberPortalService.createProduct(product));
	}
	
	@PutMapping("/portal/{id}")
	public ResponseEntity<MemberDetails> updateProduct(@PathVariable long id, @RequestBody MemberDetails product){
		product.setId(id);
		return ResponseEntity.ok().body(this.memberPortalService.updateProduct(product));
	}

	@DeleteMapping("/portal/{id}")
	public HttpStatus deleteProduct(@PathVariable long id){
		this.memberPortalService.deleteProduct(id);
		return HttpStatus.OK;
	}
}
