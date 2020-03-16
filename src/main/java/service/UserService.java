package service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import entity.Issue;
import entity.User;

public interface UserService {
	User save(User user);//veritabanına kaydetmek için.
	
	User getById(Long id);
	
	Page<User> getAllPageable(Pageable pageable);
	
	User getByUsername(String username);


}
