package com.fix8.toto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class Game {

    @Id
    private Integer gameNo;
    private String homeTeamName;
    private String awayTeamName;
}
