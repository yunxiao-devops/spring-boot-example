package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yunlong
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExampleData {
    private String msg;
}
