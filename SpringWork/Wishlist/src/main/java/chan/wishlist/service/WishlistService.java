package chan.wishlist.service;

import java.util.ArrayList;
import java.util.List;

import chan.wishlist.dto.WishlistDTO;

public interface WishlistService {
	List<WishlistDTO> wishlistSelectAll();
	WishlistDTO wishlistSelect(int productnnum);
	void wishlistInsert(WishlistDTO wishlistDTO);
	void wishlistDelete(int productnum);
}
