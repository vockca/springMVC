package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import vladislav.dashkovskiy.testTask.entities.Worker;
import vladislav.dashkovskiy.testTask.services.ChooseFreeWorkersAbove25Service;

import java.util.List;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ChooseFreeWorkersAbove25Contoller {
    private final ChooseFreeWorkersAbove25Service chooseFreeWorkersAbove25Service;

    @GetMapping(path = "/{organization}/freeworkersabove25", produces = "application/json")
    @ResponseBody
    public List<Worker> chooseFreeWorkersAbove25(@PathVariable("organization") String organization) {
        return chooseFreeWorkersAbove25Service.chooseFreeWorkersAbove25(organization);
    }
}
