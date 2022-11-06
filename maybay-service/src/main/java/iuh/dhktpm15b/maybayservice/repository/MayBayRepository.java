package iuh.dhktpm15b.maybayservice.repository;

import iuh.dhktpm15b.maybayservice.model.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {

}
