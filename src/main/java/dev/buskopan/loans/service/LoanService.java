package dev.buskopan.loans.service;

import dev.buskopan.loans.controller.dto.RequestDTO;
import dev.buskopan.loans.enums.LoanType;

import java.util.List;

public interface LoanService {
    List<LoanType> getLoans(RequestDTO dto);
}
