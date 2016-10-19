package sudhesh.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.model.Product;


@Transactional
@Repository
public class ProductDAOimpl {
	
	 private static final Logger logger = LoggerFactory.getLogger(ProductDAOimpl.class);
	 
	 @Autowired
	    private SessionFactory sessionFactory;
	     
	    public void setSessionFactory(SessionFactory sf){
	        this.sessionFactory = sf;
	    }
	 
	    //add product DAO implementation
	    public void addProduct(Product a)
	    {
	        Session session = this.sessionFactory.getCurrentSession();
	        session.persist(a);
	        logger.info("Product added,Product details="+a);
	    }

	    //view product DAO implementation
	    public List<Product> getProductList(String inst) {
	    	
	    	Session session = sessionFactory.getCurrentSession();
	    	Query query = session.createQuery("from Product where instrument = :inst");
	    	query.setParameter("inst", inst);
	    	List<Product> product = query.list();
	    	session.flush();
	    	
	    	return  product;
	    }
	    
	    // get product DAO implementation
	    public Product getProductById(int id) {
	    	 Session session = this.sessionFactory.getCurrentSession();
	    	 Product pro= (Product) session.get(Product.class, id);
			return pro;
	    	 
	    }
	    
	    //edit product DAO implementation
	    public void editProduct(Product product) {
	    	 Session session = this.sessionFactory.getCurrentSession();
	    	 session.update(product);
	    	 session.flush();
	
	    }
	    
	    //delete product DAO implementation
	    public void deleteProduct(Product product) {
	    	Session session = sessionFactory.getCurrentSession();
	        session.delete(product);
	        session.flush();

	    }
	    	
	    	
}
