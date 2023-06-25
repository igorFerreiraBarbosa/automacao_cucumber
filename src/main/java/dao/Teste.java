package dao;

import model.ProductModel;

public class Teste {
	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();
		for(ProductModel p: productDao.listar()) {
			System.out.println(p.getId_massas());
			System.out.println(p.getCustomization());
			System.out.println(p.getDisplay());
			System.out.println(p.getDisplayResolution());
			System.out.println(p.getDisplaySize());
			System.out.println(p.getProductMemory());
			System.out.println(p.getOperatingSystem());
			System.out.println(p.getProcessor());
			System.out.println(p.getTouchscreen());
			System.out.println(p.getWeight());
			System.out.println(p.getColor());
			
		}

	}

}
