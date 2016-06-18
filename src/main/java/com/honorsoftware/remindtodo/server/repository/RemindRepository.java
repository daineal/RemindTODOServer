package com.honorsoftware.remindtodo.server.repository;

import com.honorsoftware.remindtodo.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {

}
