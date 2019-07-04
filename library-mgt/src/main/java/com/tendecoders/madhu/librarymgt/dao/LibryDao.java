package com.tendecoders.madhu.librarymgt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Library;

@Component
public class LibryDao {
	List<Library> lm=new ArrayList<>();
	
	public Library create(Library library)
	{
		lm.add(library);
		return library;
	}
	
	public List<Library>getall()
	{
		return lm;
	}
	public Library get(int id) {
		return lm.get(id);
		
	}
	public void update(int id, Library library) {
		lm.set(id, library);
	}
	public void delete(int id)
	{
		lm.remove(id);

//	for (Library lib :lm) {
//
//		System.out.println(lib.getId() + " " + lib.getBookName() + " " + lib.getAuthorName() + " " + lib.getBookPrice());
//
//	}

	}
	public Library getids(long Id) {
		for(int i=0; i<lm.size();i++)
		{
			if(lm.get(i).getId()==Id) {
				return lm.get(i);
			}
		}
		return null;
	}
	
	
}

	
