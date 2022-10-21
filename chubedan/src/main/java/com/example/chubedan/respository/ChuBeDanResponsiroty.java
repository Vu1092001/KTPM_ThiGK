package com.example.chubedan.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chubedan.entity.ChuBeDan;
@Repository
public interface ChuBeDanResponsiroty extends JpaRepository<ChuBeDan, String> {

}
