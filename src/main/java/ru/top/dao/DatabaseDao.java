package ru.top.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.top.model.Food;

import java.util.List;
import java.util.Optional;

@Component
public class DatabaseDao implements FoodDao {
    @Value("${database.url}")
    private String url;

    @Value("${database.user}")
    private String user;

    @Value("${database.password}")
    private String password;


    @Override
    public List<Food> findAll() {
        return null;
    }

    @Override
    public Optional<Food> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Food save(Food food) {
        return null;
    }
}
