package ru.top.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.top.model.Food;

import java.util.ArrayList;
import java.util.List;

//По умолчанию данный класс будет парсировать все классы в рамках одного пакета, а также все подпакеты
@Configuration
@ComponentScan(value = "ru.top")
@PropertySource("classpath:/application.properties")
public class SpringConfig {

    @Bean
    public List<Food> inMemoryDatabaseList() {
        return new ArrayList<>(
                List.of(
                        new Food(1, "Жареная картошка", List.of("Картошка", "Соль", "Масло")),
                        new Food(2, "Жареная курица", List.of("Курица", "Соль", "Масло")),
                        new Food(3, "Пицца", List.of("Тесто", "Томатный соус", "Сыр моцарелла"))
                )
        );
    }
}
