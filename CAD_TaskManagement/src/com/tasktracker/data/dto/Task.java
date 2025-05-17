package com.tasktracker.data.dto;

import java.time.LocalDate;

public class Task {
    private String taskId;
    private String userId;
    private String title;
    private String description;
    private LocalDate deadline;
    private String priority; // High, Medium, Low
    private boolean isCompleted;
}
