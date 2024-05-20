package chan.spring.wishlist.service;

import java.util.ArrayList;
import java.util.List;

import chan.spring.wishlist.dto.WishlistDTO;

public interface WishlistService {
	List<WishlistDTO> wishlistSelectAll();
	WishlistDTO wishlistSelect(int productnnum);
	void wishlistInsert(WishlistDTO wishlistDTO);
	void wishlistDelete(int productnum);
}
