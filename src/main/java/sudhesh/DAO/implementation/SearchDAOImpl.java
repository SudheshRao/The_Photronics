package sudhesh.DAO.implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sudhesh.DAO.SearchDAO;
import sudhesh.model.Product;

@Transactional
@Repository
public class SearchDAOImpl implements SearchDAO {

	 @Autowired
	    private SessionFactory sessionFactory;
	     
	    public void setSessionFactory(SessionFactory sf){
	        this.sessionFactory = sf;
	    }
	    
	public List<Product> search(String pro){
		
		Session session = sessionFactory.getCurrentSession();
		
		if(pro.length()>=3){
        		Query query = session.createQuery("from Product where lower(company) = lower(:all) or lower(instrument) = lower(:all) or lower(model) = lower(:all)");
            	query.setParameter("all", pro);
            	List<Product> all = query.list();
            	
            	if(!(all.size()>0)){
            		
            		String a=pro.substring(0,3);
            		Query query2 = session.createQuery("from Product where lower(company) like lower(:al) or lower(instrument) like lower(:al) or lower(model) like lower(:al)");
                	query2.setParameter("al", "%"+a+"%");
                	List<Product> all1 = query2.list();
                	return all1;
                		
                	}
                
            	else {
            		return all;
            	}
		}else {
			return null;}
		
 
	}
	
}
