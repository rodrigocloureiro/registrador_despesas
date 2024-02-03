package com.example.despesas.controller;

import com.example.despesas.model.Expense;
import com.example.despesas.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<Object> registerExpense(@RequestBody Expense expense) {
        expenseService.registerExpense(expense);
        return ResponseEntity.ok().body("VASCO");
    }

    @GetMapping
    public ResponseEntity<Object> getAllExpenses() {
        return ResponseEntity.ok().body(expenseService.getAllExpenses());
    }
}
