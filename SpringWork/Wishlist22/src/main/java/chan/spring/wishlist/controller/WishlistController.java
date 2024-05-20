package chan.spring.wishlist.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import chan.spring.wishlist.dto.WishlistDTO;
import chan.spring.wishlist.service.WishlistServiceImp;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class WishlistController {

private static final Logger logger = LoggerFactory.getLogger(WishlistController.class);
@Autowired
private final WishlistServiceImp wishlistServiceImp;
@GetMapping("/WishlistSelect")
public String list(Model model) {
	model.addAttribute("list", wishlistServiceImp.wishlistSelectAll());
	logger.info("list", model);
	return "./wishlist/wishlist_select_view";
}
@GetMapping("/WishlistSelectDetail")
public String detail(Model model, WishlistDTO wishlistDTO) {
	model.addAttribute("wishlistDTO", wishlistServiceImp.wishlistSelect(wishlistDTO.getProductnum()));
	return "./wishlist/wishlist_select_detail_view";
}
@GetMapping("/WishlistInsert")
public String insert() {
return "./wishlist/wishlist_insert";
}
@PostMapping("/WishlistInsert")
public String insert(Model model, WishlistDTO wishlistDTO) {
	model.addAttribute("list", wishlistServiceImp.wishlistSelectAll());
	wishlistServiceImp.wishlistInsert(wishlistDTO);
	logger.info("list", model);
	return "./wishlist/wishlist_insert_view";
}
@GetMapping("/WishlistDelete")
public String delete() {
return "./wishlist/wishlist_delete";
}
@PostMapping("/WishlistDelete")
public String delete(WishlistDTO wishlistDTO) {
	wishlistServiceImp.wishlistDelete(wishlistDTO.getProductnum());
	return "./wishlist/wishlist_delete_view";
}
}
