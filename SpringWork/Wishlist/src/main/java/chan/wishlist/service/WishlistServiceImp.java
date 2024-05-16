package chan.wishlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import chan.wishlist.dao.WishlistDAO;
import chan.wishlist.dto.WishlistDTO;
@Service
public class WishlistServiceImp implements WishlistService{
	
private final WishlistDAO wishlistDAO;
@Autowired
public WishlistServiceImp(@Qualifier("wishlistDAOImp") WishlistDAO wishlistDAO) {
	this.wishlistDAO = wishlistDAO;
}
	@Override
	public List<WishlistDTO> wishlistSelectAll() {
		// TODO Auto-generated method stub
		return wishlistDAO.selectAll();
	}

	@Override
	public WishlistDTO wishlistSelect(int productnnum) {
		// TODO Auto-generated method stub
		return wishlistDAO.select(productnnum);
	}

	@Override
	public void wishlistInsert(WishlistDTO wishlistDTO) {
		wishlistDAO.insert(wishlistDTO);
		
	}

	@Override
	public void wishlistDelete(int productnum) {
		// TODO Auto-generated method stub
		wishlistDAO.delete(productnum);
	}

}
