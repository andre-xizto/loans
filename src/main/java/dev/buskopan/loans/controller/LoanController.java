package dev.buskopan.loans.controller;

import dev.buskopan.loans.controller.dto.LoanDTO;
import dev.buskopan.loans.controller.dto.RequestDTO;
import dev.buskopan.loans.controller.dto.ResponseDTO;
import dev.buskopan.loans.enums.LoanType;
import dev.buskopan.loans.service.LoanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public ResponseEntity<?> getLoans(@RequestBody RequestDTO req) {
        List<LoanType> loansAvaliable = loanService.getLoans(req);
        List<LoanDTO> loans = new ArrayList<>();
        for (LoanType type : loansAvaliable) {
            loans.add(new LoanDTO(type, type.getInterestRate()));
        }
        ResponseDTO response = new ResponseDTO(req.name(), loans);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
