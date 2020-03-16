package impl;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dto.IssueDto;
import entity.Issue;
import repository.IssueRepository;
import service.IssueService;
import util.Tpage;
@Service
public class IssueServiceImpl implements IssueService{
	private final IssueRepository issueRepository;
	private final ModelMapper modelMapper;
	//bi nesneye final etiketi verdiğimiz zaman o nesne run time da değiştirilemiyo.
	//o nesneyi güvenli hale getiriyoruz.
	@Autowired
	public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper) {
		this.issueRepository = issueRepository;
		this.modelMapper=modelMapper;
		
	}
	@Override
	public IssueDto save(IssueDto issue) {
		//Bussines Logic!
		if(issue.getDate()==null) {
			throw new IllegalArgumentException("issue date cannot be null");
		}
		
		Issue issueDb=modelMapper.map(issue, Issue.class);
		
		issueDb=issueRepository.save((issueDb));
		return modelMapper.map(issueDb, IssueDto.class);
	}
	@Override
	public IssueDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tpage<IssueDto> getAllPageable(Pageable pageable) {
		Page<Issue> data = issueRepository.findAll(pageable);
		Tpage page=new Tpage<IssueDto>();
		IssueDto[] dtos=modelMapper.map(data.getContent(), IssueDto[].class);
		
		page.setStat(data, Arrays.asList(dtos));
		return page;
		
	}
	@Override
	public Boolean delete(IssueDto issue) {
		// TODO Auto-generated method stub
		return null;
	}


}
