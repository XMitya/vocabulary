package com.xmitya.vocabulary.db.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LanguageRepository extends CrudRepository<LanguageRepository, UUID> {
}
