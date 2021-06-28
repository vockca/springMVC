package vladislav.dashkovskiy.testTask.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vladislav.dashkovskiy.testTask.entities.Worker;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface WorkersRepository extends CrudRepository<Worker, Long> {
//    @Query("SELECT w FROM Worker w WHERE w.age > 25 and w.organization.name = ?1")
    @Transactional
    List<Worker> findWorkersByAgeGreaterThanAndOrganization_Id(int workerAge, Long organizationId);

    @Query("UPDATE Worker w SET w.name = ?1 WHERE w.id = ?2")
    @Modifying
    @Transactional
    void updateWorkerNameById(String workerName, Long workerId);
}
