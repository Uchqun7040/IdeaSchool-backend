package com.example.IdeaBackend.repository;

import com.example.IdeaBackend.entity.Class;
import com.example.IdeaBackend.entity.Lesson;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends DistributedRepository<Lesson> {

    Page<Lesson> findAllByIdOrTopicContainsIgnoreCaseOrSubject_NameContainsIgnoreCaseOrRoom_NameContainsIgnoreCaseOrClas_NameContainsIgnoreCaseOrTeacher_NameContainsIgnoreCaseOrTeacher_SurnameContainsIgnoreCase(Long id, String topic, String subject, String room, String clas, String teacherN, String teacherS, Pageable pageable);
}
