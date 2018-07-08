package com.bluesgao.worthwatching.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Movie {
    private String id;
    private String name;
    private String type;
    private String director;
}
