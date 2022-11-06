package iuh.dhktpm15b.chuyenbayservice.service;

import io.github.resilience4j.retry.annotation.Retry;
import iuh.dhktpm15b.chuyenbayservice.model.ChuyenBay;
import iuh.dhktpm15b.chuyenbayservice.repository.ChuyenBayRepository;
import iuh.dhktpm15b.chuyenbayservice.vo.MayBay;
import iuh.dhktpm15b.chuyenbayservice.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ChuyenBayService {
    @Autowired
    ChuyenBayRepository chuyenBayRepository;
    private RestTemplate restTemplate;

    public ChuyenBayService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Transactional(readOnly = true)
    @Retry(name = "maybayService")
    public ResponseTemplate findChuyenBayAndMayBay(int chuyenbayId){
        ChuyenBay chuyenBay = chuyenBayRepository.findById(chuyenbayId).orElse(null);
        System.out.println(chuyenBay.toString());
        int maybayId = chuyenBay.getMaybayId();
        MayBay mayBay = restTemplate.getForObject(
                "http://localhost:9000/maybay/findById?id="+maybayId,
                MayBay.class
        );
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setChuyenBay(chuyenBay);
        responseTemplate.setMayBay(mayBay);

        return responseTemplate;
    }

    @Transactional(readOnly = true)
    public ChuyenBay findById(int id){
        return chuyenBayRepository.findById(id).orElse(null);
    }

    @Transactional
    public ChuyenBay save (ChuyenBay chuyenBay){
        return chuyenBayRepository.save(chuyenBay);
    }
}
