package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Cuenta;

@Repository
public interface ICuentaRepository extends JpaRepository<Cuenta, Integer> {

    @Query(value="SElECT * FROM Cuenta c " +
            " WHERE usuario_iidusuario=:iIDUsuario ",
            nativeQuery  = true)
    public List<Cuenta> getAllCuenta(@Param("iIDUsuario") int iIDUsuario);

}
