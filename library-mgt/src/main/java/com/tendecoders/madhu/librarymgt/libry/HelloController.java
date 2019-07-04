package com.tendecoders.madhu.librarymgt.libry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Library;
import com.tendecoders.madhu.librarymgt.service.Service;

@RestController
@RequestMapping("Libry")
public class HelloController {
	@Autowired
	Service g;
	
		@PostMapping("create")
		private Library create(@RequestBody Library library)
		{
			return g.create(library);
		}
		@GetMapping("getall")
		private List<Library>getall(){
			return g.getall();
		}
		@GetMapping("get/{Id}")
		private Library getid(@PathVariable("Id")int Id)
		{
			return g.get(Id);
		}
		@DeleteMapping("delete/{Id}")
		private void delete(@PathVariable("Id")int id)
		{
			g.delete(id);
		}
		@PostMapping("update/{Id}")
		private void updateid(@PathVariable("Id")int id,@RequestBody Library library)
		{
			g.update(id, library);
		}
}
