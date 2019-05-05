package tech.worldwild.application.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("list")
public class ListController {

    @GetMapping
    public List<Integer> getList() {
        return List.of(1, 2, 3);
    }

}