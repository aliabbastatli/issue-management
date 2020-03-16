package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.IssueHistory;
@Repository
public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long>{

}
