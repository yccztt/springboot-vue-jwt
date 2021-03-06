package com.yccztt.repository;

import com.yccztt.domain.JWTEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

/**
 * @Author hyz
 * @Date 2021/7/26
 */
public interface JWTEntityRepository extends JpaRepository<JWTEntity, Long> {

    JWTEntity findJWTEntityById(String id);

    @Transactional
    @Modifying
    void deleteJWTEntityById(String id);
}
