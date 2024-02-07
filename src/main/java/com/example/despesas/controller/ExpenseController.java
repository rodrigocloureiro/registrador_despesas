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
        return ResponseEntity.ok().body("REGISRADO");
    }

    @GetMapping
    public ResponseEntity<Object> getAllExpenses() {
        return ResponseEntity.ok().body(expenseService.getAllExpenses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getExpenseById(@PathVariable long id) {
        return ResponseEntity.ok().body(expenseService.getExpenseById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteExpenseById(@PathVariable long id) {
        expenseService.deleteExpenseById(id);
        return ResponseEntity.ok().body("DELETADO");
    }

    @DeleteMapping
    public ResponseEntity<Object> deleteExpense(@RequestBody Expense expense) {
        expenseService.deleteExpense(expense);
        return ResponseEntity.ok().body("DELETADO");
    }
}
