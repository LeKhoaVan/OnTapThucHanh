package iuh.dhktpm15b.chuyenbayservice.repository;

import iuh.dhktpm15b.chuyenbayservice.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, Integer> {
    @Query(nativeQuery = true, value = "select * from chuyen_bay where maybay_id = :maybayId")
    public List<ChuyenBay> findByMayBayId(@Param("maybayId") int maybayId);
}
