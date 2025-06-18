package com.cibertec.aplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.aplication.model.TblProducto;
import com.cibertec.aplication.repository.IProductoRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoServicioImp implements IProductoServicio {

	private final IProductoRepository productoRepository;
	
	@Override
	@Transactional
	public void registrarProducto(TblProducto tblProducto) {
		productoRepository.save(tblProducto);
		
	}

	@Override
	@Transactional
	public void eliminarProducto(TblProducto tblProducto) {
		productoRepository.deleteById(tblProducto.getIdproducto());
	}

	@Override
	@Transactional
	public List<TblProducto> listadoProductos() {
		return productoRepository.findAll();
	}

	@Override
	@Transactional
	public TblProducto buscarPorId(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}

}
