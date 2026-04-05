package com.vbs.vbs.controller;

import com.vbs.vbs.entity.BreakdownRequest;
import com.vbs.vbs.service.BreakdownService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/requests")
public class BreakdownController {

    private final BreakdownService service;

    public BreakdownController(BreakdownService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public String addPage(Model model) {
        model.addAttribute("request", new BreakdownRequest());
        return "addRequest";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BreakdownRequest request) {
        service.saveRequest(request);
        return "redirect:/requests/view";
    }

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("requests", service.getAllRequests());
        return "viewRequests";
    }

    @GetMapping("/complete/{id}")
    public String complete(@PathVariable Long id) {
        service.markCompleted(id);
        return "redirect:/requests/view";
    }
}