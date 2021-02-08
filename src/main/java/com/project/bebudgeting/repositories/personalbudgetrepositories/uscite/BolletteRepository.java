package com.project.bebudgeting.repositories.personalbudgetrepositories.uscite;

import com.project.bebudgeting.entities.personalbudgetingentity.uscite.effettive.BolletteEffettiviEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BolletteRepository extends CrudRepository<BolletteEffettiviEntity, Integer> {

    @Override
    List<BolletteEffettiviEntity> findAll();
}
