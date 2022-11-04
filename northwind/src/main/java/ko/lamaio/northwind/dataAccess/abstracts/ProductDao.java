 package ko.lamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ko.lamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
