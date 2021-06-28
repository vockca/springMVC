package vladislav.dashkovskiy.testTask.services;

import org.springframework.stereotype.Service;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.entities.Worker;


import java.util.List;

@Service
public interface WorkerService {
    void addWorker(WorkerDto workerDto);

    void updateWorkerName (Worker worker);

    List<Worker> chooseFreeExperiencedWorkers(String organizationName);
}
