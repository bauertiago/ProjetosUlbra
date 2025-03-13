package com.projetoapi.apisus.controllers;

import com.projetoapi.apisus.dtos.SchedulingResponseDTO;
import com.projetoapi.apisus.entities.Scheduling;
import com.projetoapi.apisus.services.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/scheduling")
public class SchedulingController {
    private SchedulingService schedulingService;

    @Autowired
    public SchedulingController(SchedulingService schedulingService){
        this.schedulingService = schedulingService;
    }

    @GetMapping
    public ResponseEntity<Map<String, List<SchedulingResponseDTO>>> getAllScheduling() {
        List<SchedulingResponseDTO> scheduling = this.schedulingService.getAllScheduling();
        Map<String, List<SchedulingResponseDTO>> response = new HashMap<>();
        response.put("scheduling", scheduling);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public SchedulingResponseDTO creatScheduling(@RequestBody SchedulingResponseDTO bodyRequest){
        return this.schedulingService.createScheduling(bodyRequest);
    }

    @PutMapping("/{id}")
    public Scheduling updateScheduling(@PathVariable long id, @RequestBody Scheduling updateScheduling){
        return schedulingService.updateScheduling(id, updateScheduling);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteScheduling(@PathVariable long id){
        ResponseEntity<String> response = schedulingService.deleteScheduling(id);
        return response;
    }

    @DeleteMapping("/all")
    public String deleteAll(){
        schedulingService.deleteAll();
        return "Agendamento deletado com sucesso";
    }
}
