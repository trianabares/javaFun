package com.triana.authentication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.triana.authentication.models.LogReg;
import com.triana.authentication.models.User;
import com.triana.authentication.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {

	private final UserService userServ;

	public UserController(UserService userServ) {
		this.userServ = userServ;
	}

	@GetMapping("/")
	public String raiz(Model modelo) {
		modelo.addAttribute("user", new User());
		modelo.addAttribute("login", new LogReg());
		return "logreg.jsp";
	}

	@PostMapping("/registration")
	public String registro(@Valid @ModelAttribute("user") User usuario, BindingResult resultado, Model modelo) {
		if (resultado.hasErrors()) {
			modelo.addAttribute("login", new LogReg());
			return "logreg.jsp";
		}
		User usuarioRegistrado = userServ.registroUsuario(usuario, resultado);
		modelo.addAttribute("login", new LogReg());
		if (usuarioRegistrado != null) {
			modelo.addAttribute("registro", "Gracias por registrarte, ya puedes hacer Login");
		}
		return "logreg.jsp";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("login") LogReg loginuser, BindingResult resultado, Model modelo, HttpSession sesion) {
		if(resultado.hasErrors()) {
			modelo.addAttribute("user", new User());
			return "logreg.jsp";
		}
		if(userServ.autenticarUser(loginuser.getEmail(), loginuser.getPassword(), resultado)) {
			User usuarioLog = userServ.encontrarPorEmail(loginuser.getEmail());
			sesion.setAttribute("userID", usuarioLog.getId());
			return "redirect:/dashboard";
		} else {
			modelo.addAttribute("errorLogin", "No se pudo logear");
			modelo.addAttribute("user", new User());
			return "logreg.jsp";
		}
	}
	
	@GetMapping("/dashboard")
	public String bienvenido(HttpSession sesion, Model modelo) {
		Long userId = (Long) sesion.getAttribute("userID");
		if(userId == null) {
			return "redirect:/";
		}
		User usuario = userServ.encontrarPorId(userId);
		modelo.addAttribute("usuario", usuario);
		return "dashboard.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession sesion) {
		sesion.setAttribute("userID", null);
		return "redirect:/";
	}

}
