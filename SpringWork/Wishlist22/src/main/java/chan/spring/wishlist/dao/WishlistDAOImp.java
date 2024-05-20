package chan.spring.wishlist.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import chan.spring.wishlist.dto.WishlistDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class WishlistDAOImp implements WishlistDAO {
	@Autowired
	private final SqlSessionTemplate sqlSessionTemplate;
	@Override
	public List<WishlistDTO> selectAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("chan.wishlist.selectAll");
	}

	@Override
	public WishlistDTO select(int productnum) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("chan.spring.select", productnum);
	}
@Transactional
	@Override
	public void insert(WishlistDTO wishlistDTO) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert("chan.spring.insert", wishlistDTO);
	}

	@Override
	public void delete(int productnum) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.delete("chan.spring.delete", productnum);
	}

}
