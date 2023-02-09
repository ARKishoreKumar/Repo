package Eminds.BookStore.service;

import Eminds.BookStore.entity.Roles;

import java.util.List;

public interface RolesService {
    Roles save(Roles roles);
    List<Roles> getRoles(); // get the list of sales
}
