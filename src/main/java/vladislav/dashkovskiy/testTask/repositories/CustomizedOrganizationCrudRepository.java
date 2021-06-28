package vladislav.dashkovskiy.testTask.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vladislav.dashkovskiy.testTask.entities.Organization;


@Repository
public interface CustomizedOrganizationCrudRepository extends CrudRepository<Organization, Long> {
    Organization findOrganizationByName(String organizationName);
    void deleteOrganizationByName(String organizationName);
}
