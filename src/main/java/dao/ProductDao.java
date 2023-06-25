package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ProductModel;

public class ProductDao extends ProductModel {
	public List<ProductModel> listar() throws Exception {
		List<ProductModel> produtos = new ArrayList<ProductModel>();
	try {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from massas");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			ProductModel p = new ProductModel();
			p.setId_massas(rs.getInt("ID_MASSAS"));
			p.setNameProduct(rs.getNString("NAME_PRODUCT"));
			p.setCustomization(rs.getNString("CUSTOMIZATION"));
			p.setDisplay(rs.getNString("DISPLAY"));
			p.setDisplayResolution(rs.getNString("DISPLAY_RESOLUTION"));
			p.setDisplaySize(rs.getNString("DISPLAY_SIZE"));
			p.setProductMemory(rs.getNString("PRODUCT_MEMORY"));
			p.setOperatingSystem(rs.getNString("OPERATING_SYSTEM"));
			p.setProcessor(rs.getNString("PROCESSOR"));
			p.setTouchscreen(rs.getNString("TOUCHSCREEN"));
			p.setWeight(rs.getNString("WEIGHT"));
			p.setColor(rs.getString("COLOR"));
		
			
			produtos.add(p);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
		
	catch(SQLException e) {
		throw new RuntimeException(e);
	}
	
	return produtos;
}
	
	public void updateColor() throws Exception {
		try {
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement("UPDATE `banco_teste_automacao`.`MASSAS` SET `COLOR` = 'RED' WHERE (`ID_MASSAS` = '1')");
			stmt.executeUpdate();
			
			
			
			
			stmt.close();
			con.close();
		}
		
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
