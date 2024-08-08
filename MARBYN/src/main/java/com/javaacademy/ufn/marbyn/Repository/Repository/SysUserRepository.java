package com.javaacademy.ufn.marbyn.Repository.Repository;

import com.javaacademy.ufn.marbyn.Model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    //Abstraction of the JPA Hibernate DAO and C.R.U.D functions
}
