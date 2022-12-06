package com.tefabi.hifadhi.huru.node.command.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/nodes")
public class NodeCommandController {

    @PostMapping
    public String createNode()
    {
        return "";
    }
}
