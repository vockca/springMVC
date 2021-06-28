package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.services.UpdateWorkerNameService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UpdateWorkerNameController {
    public final UpdateWorkerNameService updateWorkerNameService;

    @PutMapping(path = "/updateName", consumes = "application/json")
    public void updateWorkerName(@RequestBody Worker worker) {
        updateWorkerNameService.updateWorkerName(worker);
    }
}
