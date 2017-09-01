package com.pl10.califi.converter;

import org.springframework.stereotype.Component;

import com.pl10.califi.entity.Nota;
import com.pl10.califi.model.NotaModel;

@Component("notaConverter")
public class NotaConverter {
	
	public NotaModel notaToNotaModel(Nota nota) {
		NotaModel notaModel = new NotaModel();
		notaModel.setId(nota.getId());
		notaModel.setMatricula(nota.getMatricula());
		notaModel.setNota1(nota.getNota1());
		notaModel.setNota2(nota.getNota2());
		notaModel.setNota3(nota.getNota3());
		notaModel.setNota4(nota.getNota4());
		notaModel.setNota5(nota.getNota5());
		notaModel.setPromedio(nota.getPromedio());
		return notaModel;
	}
	
	public Nota notaModelToNota(NotaModel notaModel) {
		Nota nota = new Nota();
		nota.setId(notaModel.getId());
		nota.setMatricula(notaModel.getMatricula());
		nota.setNota1(notaModel.getNota1());
		nota.setNota2(notaModel.getNota2());
		nota.setNota3(notaModel.getNota3());
		nota.setNota4(notaModel.getNota4());
		nota.setNota5(notaModel.getNota5());
		nota.setPromedio(notaModel.getPromedio());
		return nota;
	}

}
