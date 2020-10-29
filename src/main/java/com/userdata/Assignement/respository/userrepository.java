package com.userdata.Assignement.respository;

import com.userdata.Assignement.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepository extends JpaRepository<user,Integer> {
}
