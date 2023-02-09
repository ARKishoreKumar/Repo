package Eminds.BookStore.serviceImpl;

import Eminds.BookStore.entity.Roles;
import Eminds.BookStore.repository.RolesRepository;
import Eminds.BookStore.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public Roles save(Roles roles) {
        return rolesRepository.save(roles);
    }
    @Override
    public List<Roles> getRoles() {
        return rolesRepository.findAll();
    }
}
