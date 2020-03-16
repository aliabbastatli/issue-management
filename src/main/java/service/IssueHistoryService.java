package service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import entity.Issue;
import entity.IssueHistory;

public interface IssueHistoryService {
	
	IssueHistory save(IssueHistory issueHistory);//veritabanına kaydetmek için.
	
	IssueHistory getById(Long id);
	
	Page<IssueHistory> getAllPageable(Pageable pageable);
	
	Boolean delete(IssueHistory issueHistory);


}
