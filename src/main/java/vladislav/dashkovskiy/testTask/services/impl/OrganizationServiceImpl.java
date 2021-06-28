package vladislav.dashkovskiy.testTask.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vladislav.dashkovskiy.testTask.repositories.OrganizationRepository;
import vladislav.dashkovskiy.testTask.services.OrganizationService;

@RequiredArgsConstructor
@Service
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationRepository organizationRepository;

    @Transactional
    public void deleteOrganization(String organizationName) {
        organizationRepository.deleteOrganizationByName(organizationName);
    }
}
