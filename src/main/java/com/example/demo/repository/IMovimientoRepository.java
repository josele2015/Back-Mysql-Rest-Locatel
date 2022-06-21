package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movimiento;
import com.example.demo.entity.Usuario;

@Repository
public interface IMovimientoRepository extends JpaRepository<Movimiento, Integer>{
//    @Query(value="SElECT * FROM Movimiento m " +
//            " WHERE usuario_iidusuario=:iIDUsuario ",
//            nativeQuery = true)
//    public Movimiento getAllMovimiento(@Param("iIDUsuario") int iIDUsuario);
}
