package dev.buskopan.loans.controller.dto;

import java.util.List;

public record ResponseDTO (String customer, List<LoanDTO> loans) {
}
