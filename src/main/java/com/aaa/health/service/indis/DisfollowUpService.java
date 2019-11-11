package com.aaa.health.service.indis;

import com.aaa.health.entity.indis.DisfollowUp;
import com.aaa.health.entity.indis.InfDisease;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface DisfollowUpService {
    List<Map> queryDoctor();
    int delete(String disfopId);
    List<DisfollowUp> findById(Integer disfopId);
    List<DisfollowUp> findId(Integer infdisId);
    List<DisfollowUp> findUserId(Integer infdisId);
    int update(DisfollowUp disfollowUp);
    int add(DisfollowUp disfollowUp);
    int getTotal(Integer queryMap);
}
