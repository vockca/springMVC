package vladislav.dashkovskiy.testTask.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.mapper.WorkerMapStructMapper;
import vladislav.dashkovskiy.testTask.repositories.CustomizedWorkersCrudRepository;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WorkerAdderService {
    public final WorkerMapStructMapper mapstructMapper;

    public final CustomizedWorkersCrudRepository customizedWorkersCrudRepository;

    public void addWorker(WorkerDto workerDto) {
        Worker worker = mapstructMapper.dtoToWorker(workerDto);
        customizedWorkersCrudRepository.save(worker);
    }
}
