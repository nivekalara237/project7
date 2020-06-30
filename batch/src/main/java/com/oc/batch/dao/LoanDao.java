package com.oc.batch.dao;

import com.oc.batch.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface LoanDao extends JpaRepository<Loan, Long> {
    @Query("SELECT loan FROM Loan loan WHERE loan.returned =  false and loan.dateEnd <= :dateNow")
    List<Loan> findByNotReturnedandAndDateEnd(@Param("dateNow")Date date);

}
