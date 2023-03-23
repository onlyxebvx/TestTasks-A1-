package org.A1.task3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PostingRepository extends JpaRepository<Posting, Long> {
    List<Postings> findByAuthorizedSupplyAndDocDateBetween(Boolean authorizedSupply, Date startDate, Date endDate);
}
