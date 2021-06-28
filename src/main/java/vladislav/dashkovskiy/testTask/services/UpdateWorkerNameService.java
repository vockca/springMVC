package vladislav.dashkovskiy.testTask.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.repositories.CustomizedWorkersCrudRepository;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UpdateWorkerNameService {
    private final CustomizedWorkersCrudRepository customizedWorkersCrudRepository;

    public void updateWorkerName (Worker worker) {
        customizedWorkersCrudRepository.updateWorkerNameById(worker.name, worker.id);
    }
}
