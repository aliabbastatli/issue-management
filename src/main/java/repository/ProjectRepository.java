package repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Project;
@Repository //Autowired edilmesi gereken yerlere injekte edilecek.Singleten için!
public interface ProjectRepository extends JpaRepository<Project,Long>{
	
	List<Project> getByProjectCode(String projectCode); //Proje koduyla git bana o
														   //kayıtları getir!.veritabanıda select islemi yapıyo!.
	List<Project> getByProjectCodeContains(String projectCode);
	
	Page<Project> findAll(Pageable pageable);//Kayıtları cekerken sayfalama yaptırıyo!.
	
	List<Project> findAll(Sort sort);//kayıtları cekerken sıralama yaptırmak için!.
}
