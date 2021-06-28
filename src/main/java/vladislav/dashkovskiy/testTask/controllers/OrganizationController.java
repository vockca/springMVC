package vladislav.dashkovskiy.testTask.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vladislav.dashkovskiy.testTask.entities.Organization;
import vladislav.dashkovskiy.testTask.services.OrganizationService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/organization")
public class OrganizationController {
    private final OrganizationService organizationService;

    @DeleteMapping
    public void deleteOrganization(@RequestBody Organization organization) {
        organizationService.deleteOrganization(organization.name);
    }
}
