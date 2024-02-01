package org.example.iamproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.iamproject.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;
}
