package kamazowe.azurewebapp;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

interface SqlTaskRepository extends Repository<SqlTask, Integer> {

    long count();

    List<SqlTask> findAll();

    Optional<SqlTask> findById(Integer id);

    SqlTask save(SqlTask entity);

    List<SqlTask> saveAll(Iterable<SqlTask> entities);

    void deleteById(Integer id);
}


