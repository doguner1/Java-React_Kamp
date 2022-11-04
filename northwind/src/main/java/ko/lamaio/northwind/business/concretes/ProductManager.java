package ko.lamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ko.lamaio.northwind.business.abstracts.ProductService;
import ko.lamaio.northwind.dataAccess.abstracts.ProductDao;
import ko.lamaio.northwind.entities.concretes.Product;

@Service //Bu class projede servis görevi görecek diye spring e bilgi gönderiyoruz
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired //Spring gidip arka planda buna karşılık gelebilecek projede ProductDao nun intinsı olabilecek bir sınıfı üretip buna veriyor
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
