package cl.sprint.M6_Grupo2.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.sprint.M6_Grupo2.modelos.entity.Usuario;
import cl.sprint.M6_Grupo2.modelos.service.UsuarioServicio;


	@Controller
	public class UsuarioControlador {
		
		@Autowired
		private UsuarioServicio usu;
		
		@RequestMapping(value ="/ListadoUsuarios",method = RequestMethod.GET)
		public ModelAndView listarUsuarios() {
			ArrayList<Usuario> listarUsuarios = new ArrayList<>();
			listarUsuarios = usu.obtenerUsuarios();
			
			return new ModelAndView ("listado-usuarios","listarUsuarios",listarUsuarios);
		}
	}
