package com.oc.LoanService.dao;

import com.oc.LoanService.model.Loan;
import com.oc.LoanService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanDao extends JpaRepository<Loan,Long> {
    @Query("SELECT loan FROM Loan loan WHERE loan.user.id =  :idUser")
    List<Loan> findByUser(@Param("idUser")Long idUser);
}
