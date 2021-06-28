package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vladislav.dashkovskiy.testTask.entities.Organization;
import vladislav.dashkovskiy.testTask.services.DeleteOrganizationService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DeleteOrganizationController {
    public final DeleteOrganizationService deleteOrganizationService;

    @DeleteMapping(path = "/deleteorganization")
    public void deleteOrganization(@RequestBody Organization organization) {
        deleteOrganizationService.deleteOrganization(organization.name);
    }
}
