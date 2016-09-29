package sudhesh.DAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.dao.DataAccessException;
	import org.springframework.dao.EmptyResultDataAccessException;
	import org.springframework.jdbc.core.RowMapper;
	import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
	import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
	import org.springframework.jdbc.core.namedparam.SqlParameterSource;
	import org.springframework.jdbc.support.GeneratedKeyHolder;
	import org.springframework.jdbc.support.KeyHolder;
	import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import sudhesh.model.CustomerSignup;


@Repository
@Transactional
public class CustomerSignupDAOimpl  {
	
    private static final Logger logger = LoggerFactory.getLogger(CustomerSignupDAOimpl.class);
	 
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
 
    //customer sign-up DAO implementation
    public void addCustomer(CustomerSignup p)
    {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Customer saved successfully, Customer Details="+p);
    }
 


}
