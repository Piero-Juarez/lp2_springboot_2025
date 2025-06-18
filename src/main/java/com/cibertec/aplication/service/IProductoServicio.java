package com.cibertec.aplication.service;

import java.util.List;

import com.cibertec.aplication.model.TblProducto;



public interface IProductoServicio {

	void registrarProducto(TblProducto tblProducto);
	void eliminarProducto(TblProducto tblProducto);
	List<TblProducto> listadoProductos();
	TblProducto buscarPorId(Integer id);
	
}
