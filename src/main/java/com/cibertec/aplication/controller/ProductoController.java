package com.cibertec.aplication.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.aplication.model.TblProducto;
import com.cibertec.aplication.service.ProductoServicioImp;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/vistas")
public class ProductoController {
	
	private final ProductoServicioImp productoService;
	
	@GetMapping("/listadoproductos")
	public String listadoProducto(Model modelo) {
		List<TblProducto> listado = productoService.listadoProductos();
		modelo.addAttribute("listado", listado);
		return "/vistas/ListadoProductos";
	}
	
	@GetMapping("/registrarproducto")
	public String registrarProducto(Model model) {
		TblProducto tblproducto = new TblProducto();
		model.addAttribute("regproducto", tblproducto);
		return "/vistas/RegistrarProducto";
	}
	
	@PostMapping("/guardarproducto")
	public String guardarProducto(@ModelAttribute TblProducto tblprod, Model model) {
		productoService.registrarProducto(tblprod);
		System.out.println("¡Producto registrado en la base de datos!");
		return "redirect:/vistas/listadoproductos";
	}
	
}
