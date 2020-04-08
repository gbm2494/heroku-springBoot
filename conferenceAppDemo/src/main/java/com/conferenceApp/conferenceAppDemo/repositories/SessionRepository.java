package com.conferenceApp.conferenceAppDemo.repositories;

import com.conferenceApp.conferenceAppDemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
