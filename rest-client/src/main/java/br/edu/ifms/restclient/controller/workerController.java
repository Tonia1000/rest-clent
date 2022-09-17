package br.edu.ifms.restclient.controller;

@RequestController
@RequestMapping(value = "/worker")
public class WorkerController{

    @GetMapping
    public ResponseEntity<String> getWorker(){
        return ResponseEntity.ok(WorkerService.getGreetingDescription());

    }
}