package com.member.registartion.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.member.registartion.model.MemberDetails;
import com.member.registartion.repository.MemberDetailsRepository;

@RestController
public class MemberDetailsController {

	@Autowired
	private MemberDetailsRepository repository;

	@PostMapping("/addBook")
	public String saveBook(@RequestBody MemberDetails book) {
		repository.save(book);
		return "Added book with id : " + book.getId();
	}

	@GetMapping("/findAllBooks")
	public List<MemberDetails> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/findAllBooks/{id}")
	public Optional<MemberDetails> getBook(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id : " + id;
	}

}
