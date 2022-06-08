package com.example.demo.repository;

import com.example.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {


//    @Query("SELECT u.iIDUsuario, u.tAliasUsuario, u.tPassword, u.tNombreUsuario, u.bActivo " +
//            " FROM Usuario u " )
//    public List<UsuarioDao> getAllUsuario();


}
