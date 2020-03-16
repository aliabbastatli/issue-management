package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Issue;
@Repository
public interface IssueRepository  extends JpaRepository<Issue,Long>{

}
