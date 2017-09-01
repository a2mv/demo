package com.pl10.califi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pl10.califi.entity.Nota;

@Repository("notaRepository")
public interface NotaRepository extends JpaRepository<Nota, Serializable> {

	public abstract Nota findById(String id);
}
