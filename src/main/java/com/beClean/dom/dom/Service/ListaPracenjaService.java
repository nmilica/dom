package com.beClean.dom.dom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beClean.dom.dom.Entity.ListaPracenja;
import com.beClean.dom.dom.Repository.ListaPracenjaRepository;

@Service
public class ListaPracenjaService {
	@Autowired
	ListaPracenjaRepository listaPracenjaRepository;
	
	public List<ListaPracenja> getAllLists (){
		return (List<ListaPracenja>) listaPracenjaRepository.findAll();
	}
	
	public ListaPracenja getListaById(int id) {
		Optional<ListaPracenja>listaOptional = listaPracenjaRepository.findById(id);
		if(!listaOptional.isPresent()) {
			throw new IllegalArgumentException("ne postoji");
		}
		return listaOptional.get();
	}
	
	public ListaPracenja dodajListu(ListaPracenja listaPracenja) {
		return listaPracenjaRepository.save(listaPracenja);
	}
		public ListaPracenja azurirajListu(ListaPracenja listaPracenja) {
			return listaPracenjaRepository.save(listaPracenja);
		}
		
		public void deleteListu (int id) {
			listaPracenjaRepository.deleteById(id);
		}
      
		public List<ListaPracenja>getListaByKorisnikId(int korisnikId){
            return listaPracenjaRepository.findByKorisnikId(korisnikId);
		}
		
		
}
