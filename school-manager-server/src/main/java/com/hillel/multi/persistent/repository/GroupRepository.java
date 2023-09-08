package com.hillel.multi.persistent.repository;

import com.hillel.multi.persistent.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {

}
