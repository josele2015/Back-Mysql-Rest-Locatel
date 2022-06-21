package com.example.demo.repository;

import com.example.demo.entity.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {


    @Query(value="SElECT * FROM usuario u " +
            " WHERE u.taliasusuario = :usuario and u.tpassword = :password and u.iidusuario = 1 ORDER BY u.iidusuario DESC Limit 1 ",
            nativeQuery  = true)
    public Usuario getUsuarioLogin(@Param("usuario") String usuario,@Param("password") String password);

}
