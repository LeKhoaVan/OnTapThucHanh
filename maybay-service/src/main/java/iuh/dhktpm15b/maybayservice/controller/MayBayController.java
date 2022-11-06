package iuh.dhktpm15b.maybayservice.controller;

import iuh.dhktpm15b.maybayservice.model.MayBay;
import iuh.dhktpm15b.maybayservice.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/maybay")
public class MayBayController {
    @Autowired
    MayBayService mayBayService;

    @GetMapping("/findAll")
    public ResponseEntity findAll(){
        return new ResponseEntity(mayBayService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findById")
    @Cacheable(value = "maybay", key = "#id")
    public MayBay findById(@RequestParam("id") int id) {
        return mayBayService.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity addMayBay(@RequestBody MayBay mayBay){
        return new ResponseEntity(mayBayService.save(mayBay), HttpStatus.CREATED);
    }

//    @CachePut(value = "employees",key = "#employeeId") update
//    @CacheEvict(value = "employees", allEntries = true) delete


}
