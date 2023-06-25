package automacao_cucumber;

import dao.ProductDao;
import model.ProductModel;

public class main {

	public static void Main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();
		for(ProductModel p: productDao.listar()) {
			System.out.println(p.toString());
		}

	}

}
