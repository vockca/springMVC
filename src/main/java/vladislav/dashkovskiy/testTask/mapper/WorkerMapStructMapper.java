package vladislav.dashkovskiy.testTask.mapper;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.entities.Organization;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.repositories.OrganizationRepository;

import javax.transaction.Transactional;
import java.util.List;

@Mapper(componentModel = "spring")
public abstract class WorkerMapStructMapper {
    @Autowired
    OrganizationRepository organizationRepository;

    abstract public Worker dtoToWorker(WorkerDto workerDTO);

    @Transactional
    Organization organizationToOrganizationObject(String organization) {
        return organizationRepository.findOrganizationByName(organization);
    }

    String skillsListToString(List<String> skills) {
        return String.join(";", skills);
    }
}
