package com.fastcampus.springpractice;

import com.fastcampus.springpractice.config.Config;
import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.logic.Sort;
import com.fastcampus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);
        List<String> sorted = sortService.doSort(List.of(args));
        System.out.println("[result]: " + sorted);
    }
}
