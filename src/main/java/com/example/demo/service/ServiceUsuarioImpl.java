package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.IUsuarioRepository;

@Service("ServiceUsuarioImpl")
public class ServiceUsuarioImpl implements IUsuario{
	@Autowired 
	@Qualifier("IUsuarioRepository")
	IUsuarioRepository iUsuarioRepository;
	@Override
	public Usuario getUsuarioLogin(String Usuario,String Password){
		
		return iUsuarioRepository. getUsuarioLogin(Usuario, Password);
	}
	
	
	public List<Usuario> findAll(){
		return iUsuarioRepository.findAll();
	}
}
