package Eminds.BookStore.controller;


import Eminds.BookStore.entity.Roles;
import Eminds.BookStore.repository.RolesRepository;
import Eminds.BookStore.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService rolesService;

    @Autowired
    private RolesRepository rolesRepository;

    @PostMapping("/save")
    public ResponseEntity<?> createRoles(@RequestBody Roles roles) {
        rolesService.save(roles);
        return new ResponseEntity<>("Registered Successfully", HttpStatus.CREATED);
    }
    @GetMapping("/view")
    public ResponseEntity<List<Roles>> getRoles(){
        return ResponseEntity.ok(rolesService.getRoles());
    }



    @GetMapping("{id}")
    public Optional<Roles> getRolesById(@PathVariable long id){
        Optional<Roles> roles = rolesRepository.findById(id);
        return roles;
    }
}
