package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.services.WorkerService;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WorkerController {
    public final WorkerService workerService;

    @PutMapping(path = "/updateName", consumes = "application/json")
    public void updateWorkerName(@RequestBody Worker worker) {
        workerService.updateWorkerName(worker);
    }

    @PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
    public void addWorker(@RequestBody WorkerDto workerDto) {
        workerService.addWorker(workerDto);
    }

    @GetMapping(path = "/{organization}/freeworkersabove25", produces = "application/json")
    @ResponseBody
    public List<Worker> chooseFreeWorkersAbove25(@PathVariable("organization") String organization) {
        return workerService.chooseFreeWorkersAbove25(organization);
    }
}
