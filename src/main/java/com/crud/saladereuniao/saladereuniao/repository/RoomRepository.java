package com.crud.saladereuniao.saladereuniao.repository;

import com.crud.saladereuniao.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository // irá extender de Repository
public interface RoomRepository extends JpaRepository<Room, Long>{


}
