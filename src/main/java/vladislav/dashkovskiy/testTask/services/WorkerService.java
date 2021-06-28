package vladislav.dashkovskiy.testTask.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.entities.Organization;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.mapper.WorkerMapStructMapper;
import vladislav.dashkovskiy.testTask.repositories.CustomizedOrganizationCrudRepository;
import vladislav.dashkovskiy.testTask.repositories.CustomizedWorkersCrudRepository;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WorkerService {
    public final WorkerMapStructMapper mapstructMapper;

    public final CustomizedWorkersCrudRepository customizedWorkersCrudRepository;

    private final CustomizedOrganizationCrudRepository customizedOrganizationCrudRepository;

    public void addWorker(WorkerDto workerDto) {
        Worker worker = mapstructMapper.dtoToWorker(workerDto);
        customizedWorkersCrudRepository.save(worker);
    }

    public void updateWorkerName (Worker worker) {
        customizedWorkersCrudRepository.updateWorkerNameById(worker.name, worker.id);
    }

    public List<Worker> chooseFreeWorkersAbove25(String organizationName) {
        Organization organization = customizedOrganizationCrudRepository.findOrganizationByName(organizationName);
        return customizedWorkersCrudRepository.findFreeWorkersByOrganizationIdAbove25(organization.id);
    }
}
