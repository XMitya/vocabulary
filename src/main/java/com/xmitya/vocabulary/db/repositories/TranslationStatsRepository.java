package com.xmitya.vocabulary.db.repositories;

import com.xmitya.vocabulary.db.entities.TranslationStats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TranslationStatsRepository extends CrudRepository<TranslationStats, UUID> {
}
