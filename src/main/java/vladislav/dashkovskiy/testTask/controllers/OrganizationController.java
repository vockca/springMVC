package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vladislav.dashkovskiy.testTask.entities.Organization;
import vladislav.dashkovskiy.testTask.services.OrganizationService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrganizationController {
    public final OrganizationService organizationService;


    @DeleteMapping(path = "/deleteorganization")
    public void deleteOrganization(@RequestBody Organization organization) {
        organizationService.deleteOrganization(organization.name);
    }
}
