package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cuenta;
import com.example.demo.repository.ICuentaRepository;
@Service("ServiceCuentaImpl")
public class ServiceCuentaImpl implements ICuenta{
	@Autowired 
	@Qualifier("ICuentaRepository")
	private ICuentaRepository iCuentaRepository;
	
	@Override
	public List<Cuenta> getAllCuenta(int iIDUsuario) {
		// TODO Auto-generated method stub
		return iCuentaRepository.getAllCuenta(iIDUsuario);
	}

}
