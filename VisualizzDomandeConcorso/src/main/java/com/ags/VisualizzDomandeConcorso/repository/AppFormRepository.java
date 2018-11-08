package com.ags.VisualizzDomandeConcorso.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ags.VisualizzDomandeConcorso.model.AppForm;


public interface AppFormRepository extends JpaRepository<AppForm, Long> {
}
