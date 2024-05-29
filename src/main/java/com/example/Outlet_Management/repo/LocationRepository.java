package com.example.Outlet_Management.repo;

import com.example.Outlet_Management.entity.MhLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<MhLocation,String> {
    List<MhLocation> findByMerchantId(String id);
}
