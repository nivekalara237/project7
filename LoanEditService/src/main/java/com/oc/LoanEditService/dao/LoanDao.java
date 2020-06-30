package com.oc.LoanEditService.dao;

import com.oc.LoanEditService.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDao extends JpaRepository<Loan,Long> {
}
