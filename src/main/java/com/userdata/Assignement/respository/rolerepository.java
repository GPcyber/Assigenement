package com.userdata.Assignement.respository;

import com.userdata.Assignement.model.role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rolerepository extends JpaRepository<role,String> {
}
