package sudhesh.Service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sudhesh.DAO.SearchDAO;
import sudhesh.Service.SearchService;
import sudhesh.model.Product;

@Service
public class SearchServiceimpl implements SearchService {
	
	@Autowired
	private SearchDAO sdao;
	
	public List<Product> search(String pro){
		return sdao.search(pro);
	}

}
