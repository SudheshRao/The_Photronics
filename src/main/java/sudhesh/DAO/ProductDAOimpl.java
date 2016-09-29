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
	 
	  
	    public void addProduct(Product a)
	    {
	        Session session = this.sessionFactory.getCurrentSession();
	        session.persist(a);
	        logger.info("Product added,Product details="+a);
	    }

	    	public List<Product> getProductList() {
	    	Session session = sessionFactory.getCurrentSession();
	    	Query query = session.createQuery("from Product");
	    	List<Product> product = query.list();
	    	session.flush();
	    	
	    	return  product;
	    }
	    	
	    public Product getProductById(int id) {
	    	 Session session = this.sessionFactory.getCurrentSession();
	    	 Product pro= (Product) session.get(Product.class, id);
			return pro;
	    	 
	    }	
	    	
	    	
}
