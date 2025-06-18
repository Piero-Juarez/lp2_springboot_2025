package com.cibertec.aplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.aplication.model.TblProducto;


@Repository
public interface IProductoRepository extends JpaRepository<TblProducto, Integer> {

}
