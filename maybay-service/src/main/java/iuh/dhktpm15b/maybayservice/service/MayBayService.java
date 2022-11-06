package iuh.dhktpm15b.maybayservice.service;

import iuh.dhktpm15b.maybayservice.model.MayBay;
import iuh.dhktpm15b.maybayservice.repository.MayBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MayBayService {
    @Autowired
    MayBayRepository mayBayRepository;

    @Transactional
    public MayBay save(MayBay mayBay){
      return mayBayRepository.save(mayBay);
    }

    @Transactional(readOnly = true)
    public List<MayBay> findAll(){
        return mayBayRepository.findAll();
    }

    @Transactional(readOnly = true)
    public MayBay findById(Integer id) {
        return mayBayRepository.findById(id).orElse(null);
    }
}
