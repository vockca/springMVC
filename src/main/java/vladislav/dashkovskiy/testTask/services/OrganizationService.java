package vladislav.dashkovskiy.testTask.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public interface OrganizationService {
    @Transactional
    void deleteOrganization(String organizationName);
}
