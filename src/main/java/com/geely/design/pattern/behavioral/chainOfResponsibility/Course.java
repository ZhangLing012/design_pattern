package com.geely.design.pattern.behavioral.chainOfResponsibility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Course {
    private String name;
    private String article;
    private String video;
}
