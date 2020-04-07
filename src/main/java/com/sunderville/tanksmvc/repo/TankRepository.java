package com.sunderville.tanksmvc.repo;

import com.sunderville.tanksmvc.models.TankEntry;
import org.springframework.data.repository.CrudRepository;

public interface TankRepository extends CrudRepository<TankEntry, Long> {
}
