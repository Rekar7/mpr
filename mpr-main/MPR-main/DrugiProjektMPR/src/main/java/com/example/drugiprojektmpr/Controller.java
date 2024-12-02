package com.example.drugiprojektmpr;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class Controller {

    @GetMapping("/theirEndpoint/awards/{id}")
    public ResponseEntity<List<String>> awards(@PathVariable UUID id) {
        return ResponseEntity.ok(List.of("Mistrzostwo Polski","Mistrzostwo Świata"));
    }
}
