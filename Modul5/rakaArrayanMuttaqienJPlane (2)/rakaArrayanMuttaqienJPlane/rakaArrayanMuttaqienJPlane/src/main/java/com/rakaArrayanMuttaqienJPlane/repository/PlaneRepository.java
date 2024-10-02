package com.rakaArrayanMuttaqienJPlane.repository;

import com.rakaArrayanMuttaqienJPlane.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface PlaneRepository extends JpaRepository<Plane, Long> {
        Plane findFirstByCode(String code);
    }

