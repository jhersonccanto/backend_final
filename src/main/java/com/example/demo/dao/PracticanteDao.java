package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Practicante;

public interface PracticanteDao {
	Practicante create(Practicante a);

	Practicante update(Practicante a);

	void delete(Long id);

	Optional<Practicante> read(Long id);

	List<Practicante> readAll();
}
