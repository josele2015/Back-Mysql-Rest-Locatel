package com.example.demo.controller;

import com.example.demo.dao.CuentaDao;
import com.example.demo.dao.LoginDao;
import com.example.demo.dao.MovimientoDao;
import com.example.demo.dao.UsuarioDao;
import com.example.demo.entity.Cuenta;
import com.example.demo.entity.Movimiento;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.ICuentaRepository;
import com.example.demo.repository.IMovimientoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import com.example.demo.repository.IUsuarioRepository;
import com.example.demo.service.ServiceUsuarioImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class Controller {
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	@Autowired
	@Qualifier("IUsuarioRepository")
	private IUsuarioRepository iUsuarioRepository;
	@Autowired
	@Qualifier("ICuentaRepository")
	private ICuentaRepository iCuentaRepository;
	@Autowired
	private IMovimientoRepository iMovimientoRepository;
	@GetMapping(path="/AllUsuario")
	public @ResponseBody
	List<Usuario> getAllUsuario() {
		// This returns a JSON Usuario
		return iUsuarioRepository.findAll();
	}
	
	@GetMapping(path="/AllMovimiento")
	public @ResponseBody
	List<Movimiento> getAllMovimiento() {
		// This returns a JSON Movimiento
		return iMovimientoRepository.findAll();
	}
	
	
	@GetMapping(path="/AllCuenta")
	public @ResponseBody
	List<Cuenta> getAllCuenta() {
		// This returns a JSON Cuenta
		return iCuentaRepository.findAll();
	}

	@PostMapping(path="/Login")
	public @ResponseBody 
	UsuarioDao login(@RequestBody LoginDao loginDao ) {
		log.info("Realizando Login");
		//String token = getJWTToken(username);
		Usuario usuario=new Usuario();
		usuario =iUsuarioRepository.getUsuarioLogin(loginDao.getUsuario(), loginDao.getPassword());
		UsuarioDao usuarioDao=new UsuarioDao();
		if(usuario!=null ) {
			usuarioDao.setbActivo(usuario.getBActivo());
			usuarioDao.setId(usuario.getId());
			usuarioDao.settAliasUsuario(usuario.getTAliasUsuario());
			usuarioDao.settNombreUsuario(usuario.getTNombreUsuario());
			usuarioDao.settPassword(usuario.getTPassword());
			usuarioDao.setToken("vacio");
		}else {
			usuarioDao.setToken("El usuario no existe");
		}
		return usuarioDao;
	}
	
	
	@GetMapping(path="/GetAllCuenta")
	public @ResponseBody 
	List<CuentaDao> GetAllCuenta(@RequestBody int iIDUsuario) {
		List<Cuenta> cuentas=new ArrayList();
		cuentas =iCuentaRepository.getAllCuenta(iIDUsuario);
		List<CuentaDao> ListCuentasDao=new ArrayList();
		for(Cuenta cuenta:cuentas) {
			
		}
		return ListCuentasDao;
	}
	
//	private String getJWTToken(String username) {
//		String secretKey = "mySecretKey";
//		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
//				.commaSeparatedStringToAuthorityList("ROLE_USER");
//		
//		String token = Jwts
//				.builder()
//				.setId("softtekJWT")
//				.setSubject(username)
//				.claim("authorities",
//						grantedAuthorities.stream()
//								.map(GrantedAuthority::getAuthority)
//								.collect(Collectors.toList()))
//				.setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date(System.currentTimeMillis() + 600000))
//				.signWith(SignatureAlgorithm.HS512,
//						secretKey.getBytes()).compact();
//
//		return "Bearer " + token;
//	}
	

}
