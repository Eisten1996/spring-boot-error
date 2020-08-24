package com.bolasaideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolasaideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		// TODO Auto-generated constructor stub
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Eisten", "Flores"));
		this.lista.add(new Usuario(2, "Mirian", "Sanchez"));
		this.lista.add(new Usuario(3, "Mirko", "Flores"));
		this.lista.add(new Usuario(4, "Daniel", "Sideral"));
		this.lista.add(new Usuario(5, "Chupetin", "Trujillo"));
		this.lista.add(new Usuario(6, "Dipper", "Pines"));
		this.lista.add(new Usuario(7, "Benito", "Camelas"));
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return this.lista;
	}

	@Override
	public Usuario ObtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		for (Usuario u : this.lista) {
			if (u.getId().equals(id)) {
				usuario = u;
				break;
			}
		}
		return usuario;
	}

}
