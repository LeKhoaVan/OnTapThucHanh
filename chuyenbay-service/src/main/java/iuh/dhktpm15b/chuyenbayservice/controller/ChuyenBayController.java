package iuh.dhktpm15b.chuyenbayservice.controller;

import iuh.dhktpm15b.chuyenbayservice.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
    @Autowired
    ChuyenBayService chuyenBayService;

    @GetMapping("findById")
    public ResponseEntity findById(@RequestParam("id") int id) {
        return new ResponseEntity<>(chuyenBayService.findById(id),HttpStatus.OK);
    }

    @GetMapping("/findChuyenBayAndMayBay")
    public ResponseEntity findChuyenBayAndMayBay(@RequestParam("id") int id){
        return new ResponseEntity(chuyenBayService.findChuyenBayAndMayBay(id), HttpStatus.OK);
    }
}
