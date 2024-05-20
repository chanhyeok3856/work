package chan.spring.wishlist.dao;

import java.util.List;

import chan.spring.wishlist.dto.WishlistDTO;

public interface WishlistDAO {
public List<WishlistDTO> selectAll();
public WishlistDTO select(int productnum);
public void insert(WishlistDTO wishlistDTO);
public void delete(int productnum);
}
