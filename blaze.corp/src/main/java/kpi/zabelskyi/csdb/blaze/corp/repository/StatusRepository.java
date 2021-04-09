package kpi.zabelskyi.csdb.blaze.corp.repository;

import kpi.zabelskyi.csdb.blaze.corp.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {

}