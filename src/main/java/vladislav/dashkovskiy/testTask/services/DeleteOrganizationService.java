package vladislav.dashkovskiy.testTask.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vladislav.dashkovskiy.testTask.repositories.CustomizedOrganizationCrudRepository;
import vladislav.dashkovskiy.testTask.repositories.CustomizedWorkersCrudRepository;


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DeleteOrganizationService {
    private final CustomizedOrganizationCrudRepository customizedOrganizationCrudRepository;

    @Transactional
    public void deleteOrganization(String organizationName) {
        customizedOrganizationCrudRepository.deleteOrganizationByName(organizationName);
    }
}
