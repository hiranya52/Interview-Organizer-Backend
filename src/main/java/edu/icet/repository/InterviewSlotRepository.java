package edu.icet.repository;

import edu.icet.model.entity.InterviewSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewSlotRepository extends JpaRepository<InterviewSlot, Long> {
}
