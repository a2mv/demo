package com.pl10.califi.service;

import java.util.List;

import com.pl10.califi.entity.Nota;
import com.pl10.califi.model.NotaModel;

public interface NotaService {

	public abstract NotaModel addNotaModel(NotaModel notaModel);
	
	public abstract Nota findNotaById(String id);
	
	public abstract NotaModel findNotaModelById(String id);
	
	public abstract List<NotaModel> listAllNotaModels();
}
