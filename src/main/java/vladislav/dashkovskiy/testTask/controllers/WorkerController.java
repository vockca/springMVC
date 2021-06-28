package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.services.WorkerService;

import java.util.List;

import static vladislav.dashkovskiy.testTask.TestTaskApplication.JSON;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/workers")
public class WorkerController {
    private final WorkerService workerService;

    @PutMapping(path = "/updateName", consumes = JSON)
    public void updateWorkerName(@RequestBody Worker worker) {
        workerService.updateWorkerName(worker);
    }

    @PostMapping(path = "/add", consumes = JSON, produces = JSON)
    public void addWorker(@RequestBody WorkerDto workerDto) {
        workerService.addWorker(workerDto);
    }

    @GetMapping(path = "/{organization}/freeexperiencedworkers", produces = JSON)
    @ResponseBody
    public List<Worker> chooseFreeExperiencedWorkers(@PathVariable("organization") String organization) {
        return workerService.chooseFreeExperiencedWorkers(organization);
    }
}
