package com.waga.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waga.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}