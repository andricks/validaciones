package com.example.produc.Service;

import java.util.List;

import com.example.produc.entitie.Estudiante;

public interface EstudiantesService {
	public List<Estudiante> findAll();
	public Estudiante findById(Long id);
	public void createEstudiante(Estudiante estudiante);
	public void modifyEstudiante(Long id, Estudiante estudiante);
	public void deleteEstudiante(Long id);
}
