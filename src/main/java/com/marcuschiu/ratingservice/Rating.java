package com.marcuschiu.ratingservice;

import lombok.Data;

@Data
public class Rating {
    private Long id;
    private Long bookId;
    private int stars;

    public Rating(long l, long l1, int i) {
    }

    //standard getters and setters
}
