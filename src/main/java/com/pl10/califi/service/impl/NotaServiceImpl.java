package com.pl10.califi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pl10.califi.converter.NotaConverter;
import com.pl10.califi.entity.Nota;
import com.pl10.califi.model.NotaModel;
import com.pl10.califi.repository.NotaRepository;
import com.pl10.califi.service.NotaService;

@Service("notaService")
public class NotaServiceImpl implements NotaService {

	@Autowired
	@Qualifier("notaConverter")
	NotaConverter notaConverter;
	
	@Autowired
	@Qualifier("notaRepository")
	NotaRepository notaRepository;
	
	@Override
	public NotaModel addNotaModel(NotaModel notaModel) {
		Nota nota = notaConverter.notaModelToNota(notaModel);
		return notaConverter.notaToNotaModel(notaRepository.save(nota));
	}

	@Override
	public Nota findNotaById(String id) {		
		return notaRepository.findById(id);
	}

	@Override
	public NotaModel findNotaModelById(String id) {
		return notaConverter.notaToNotaModel(findNotaById(id));
	}

	@Override
	public List<NotaModel> listAllNotaModels() {
		List<Nota> notas = notaRepository.findAll();
		List<NotaModel> notaModels = new ArrayList<NotaModel>();
		for(Nota nota: notas) {
			notaModels.add(notaConverter.notaToNotaModel(nota));
		}
		return notaModels;
	}

}
