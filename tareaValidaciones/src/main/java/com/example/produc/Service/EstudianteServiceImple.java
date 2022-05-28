package com.example.produc.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.produc.Dao.EstudiantesDao;
import com.example.produc.entitie.Estudiante;
import com.example.produc.exceptions.NotFoundException;



@Service
public class EstudianteServiceImple implements EstudiantesService {
	@Autowired
	EstudiantesDao estudianteDao;

	@Override
	public List<Estudiante> findAll() {
		
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	public Estudiante findById(Long id) {
		Optional<Estudiante> optionalEstudiante = estudianteDao.findById(id);
		if (optionalEstudiante.isPresent()) {
			return optionalEstudiante.get();
		}else {
			throw new NotFoundException("Estudiante no encontrado");
		}
	}

	@Override
	public void createEstudiante(Estudiante estudiante) {
		estudianteDao.save(estudiante);
		
	}

	@Override
	public void modifyEstudiante(Long id, Estudiante estudiante) {
		if (estudianteDao.existsById(id)) {
			estudiante.setId(id);
			estudianteDao.save(estudiante);
		}
		
	}

	@Override
	public void deleteEstudiante(Long id) {
		if (estudianteDao.existsById(id)) {			
			estudianteDao.deleteById(id);
		}
		
	}

}
