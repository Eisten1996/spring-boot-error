package com.bolasaideas.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolasaideas.springboot.error.app.errors.UsuarioNoEncontradoException;
import com.bolasaideas.springboot.error.app.models.domain.Usuario;
import com.bolasaideas.springboot.error.app.services.UsuarioService;

@Controller
public class AppController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/index")
	public String index() {
		/* Integer valor = 100 / 0; */
		Integer valor = Integer.parseInt("10x");
		return "index";
	}

	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		Usuario usuario = usuarioService.ObtenerPorId(id);
		if (usuario == null) {
			throw new UsuarioNoEncontradoException(id.toString());
		}
		model.addAttribute("titulo", "Detalle Usuario :".concat(usuario.getNombre()));
		model.addAttribute("usuario", usuario);
		return "ver";
	}
}
