package impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import entity.Project;
import repository.ProjectRepository;
import service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService{
	
	private final ProjectRepository projectRepository;
	 
	public ProjectServiceImpl(ProjectRepository projectRepository) {
		this.projectRepository=projectRepository;
	}

	@Override
	public Project save(Project project) {
		
		if(project.getProjectCode()==null) {
			throw new IllegalArgumentException("Project code cannot be null!");
			
		}
		
		return projectRepository.save(project);
	}

	@Override
	public Project getById(Long id) {
		
		return projectRepository.getOne(id);
	}

	@Override
	public List<Project> getByProjectCode(String projectCode) {
		
		return null;
	}

	@Override
	public List<Project> getByProjectCodeContains(String projectCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Project> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

}
