package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Cuenta;

public interface ICuenta {
	public List<Cuenta> getAllCuenta(int iIDUsuario);
}
