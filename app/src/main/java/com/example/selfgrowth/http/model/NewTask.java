package com.example.selfgrowth.http.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewTask {

    private String name;
    private String description;
    private String label;
    private int cycleType;
    private int type;
    private boolean isComplete;
}
