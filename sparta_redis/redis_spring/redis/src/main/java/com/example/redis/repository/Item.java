package com.example.redis.repository;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
// Entity 대신 RedisHash
@RedisHash("item")
public class Item implements Serializable {
    // Id String으로 쓰면 UUID 자동 배정
    @Id
    private Long id;
    private String name;
    private String description;
    private Integer price;
}
