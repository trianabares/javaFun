package com.triana.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.triana.authentication.models.User;
import com.triana.authentication.repositories.UserRepo;

@Service
public class UserService {

	private final UserRepo userRepo;
	public UserService(UserRepo uRe) {
		this.userRepo = uRe;
	}
	
	// ENCONTRAR USUARIO POR EMAIL
	
	public User encontrarPorEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	// ENCONTRAR USUARIO POR Id
	
		public User encontrarPorId(Long id) {
			Optional<User> user = userRepo.findById(id);
			if(user.isPresent()) {
				return user.get();
			}
			return null;
		}
	
	// REGISTRO DE USUARIO
	
	public User registroUsuario(User user, BindingResult resultado) {
		User usuarioRegistrado = userRepo.findByEmail(user.getEmail());
		if(usuarioRegistrado != null) {
			resultado.rejectValue("email", "Matches", "El correo electrónico que ingresó ya existe");
		}
		if(!user.getPassword().equals(user.getPasswordConfirmation())) {
			resultado.rejectValue("password", "Matches", "Las contraseñas no coinciden");
		}
		if(resultado.hasErrors()) {
			return null;
		}
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepo.save(user);
	}
	
	// AUTENTICAR USUARIO - LOGIN
	
	public boolean autenticarUser(String email, String password, BindingResult resultado) {
		User usuarioRegistrado = userRepo.findByEmail(email);
		if(usuarioRegistrado == null) {
			resultado.rejectValue("email", "Matches", "No se encontró el email ingresado");
			return false;
		} else {
			if(BCrypt.checkpw(password, usuarioRegistrado.getPassword())) {
				return true;
			} else {
				resultado.rejectValue("password", "Matches", "La contraseña no es correcta");
				return false;
			}
		}
	}
	
	
	
}
