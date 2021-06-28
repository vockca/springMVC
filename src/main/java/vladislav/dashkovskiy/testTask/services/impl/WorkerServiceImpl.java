package vladislav.dashkovskiy.testTask.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.mapper.WorkerMapStructMapper;
import vladislav.dashkovskiy.testTask.repositories.OrganizationRepository;
import vladislav.dashkovskiy.testTask.repositories.WorkersRepository;
import vladislav.dashkovskiy.testTask.services.WorkerService;

import java.util.List;

import static vladislav.dashkovskiy.testTask.TestTaskApplication.WORKER_AGE;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {
    private final WorkerMapStructMapper mapstructMapper;

    private final WorkersRepository workersRepository;

    private final OrganizationRepository organizationRepository;

    public void addWorker(WorkerDto workerDto) {
        Worker worker = mapstructMapper.dtoToWorker(workerDto);
        workersRepository.save(worker);
    }

    public void updateWorkerName (Worker worker) {
        workersRepository.updateWorkerNameById(worker.name, worker.id);
    }

    public List<Worker> chooseFreeExperiencedWorkers(String organizationName) {
        return workersRepository.findWorkersByAgeGreaterThanAndOrganization_Id(WORKER_AGE, organizationRepository.findOrganizationByName(organizationName).id);
    }
}
