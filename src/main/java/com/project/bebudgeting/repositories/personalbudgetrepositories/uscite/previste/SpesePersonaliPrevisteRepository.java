package com.project.bebudgeting.repositories.personalbudgetrepositories.uscite.previste;

import com.project.bebudgeting.entities.personalbudgetingentity.uscite.effettive.SpesePersonaliEffettiveEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpesePersonaliPrevisteRepository extends CrudRepository<SpesePersonaliEffettiveEntity, Integer> {

    @Override
    List<SpesePersonaliEffettiveEntity> findAll();
}
