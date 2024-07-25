package dev.buskopan.loans.controller.dto;

import dev.buskopan.loans.enums.LoanType;

import java.util.List;

public record ResponseDTO (String customer, List<LoanType> loans) {
}
