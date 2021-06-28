package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vladislav.dashkovskiy.testTask.dto.WorkerDto;
import vladislav.dashkovskiy.testTask.services.WorkerAdderService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WorkerAdderController {
    public final WorkerAdderService workerAdderService;

    @PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
    public void addWorker(@RequestBody WorkerDto workerDto) {
        workerAdderService.addWorker(workerDto);
    }
}
