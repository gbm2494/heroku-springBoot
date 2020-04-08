package com.conferenceApp.conferenceAppDemo.repositories;

import com.conferenceApp.conferenceAppDemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
