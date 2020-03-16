package service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import dto.IssueDto;
import entity.Issue;
import util.Tpage;

public interface IssueService {
	
	IssueDto save(IssueDto issue);//veritabanına kaydetmek için.
	
	IssueDto getById(Long id);
	
	Tpage<IssueDto> getAllPageable(Pageable pageable);
	
	Boolean delete(IssueDto issue);

}
