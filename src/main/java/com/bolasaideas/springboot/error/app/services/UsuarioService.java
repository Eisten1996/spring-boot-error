package com.bolasaideas.springboot.error.app.services;

import java.util.List;

import com.bolasaideas.springboot.error.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();

	public Usuario ObtenerPorId(Integer id);

}
