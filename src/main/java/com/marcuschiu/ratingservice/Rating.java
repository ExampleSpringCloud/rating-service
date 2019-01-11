package com.marcuschiu.ratingservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rating {
    Long id;
    Long bookId;
    int stars;
}
