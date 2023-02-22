package com.base.project.domain.Item.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value="A")
@Getter
@Setter
public class Album extends Item{
    private String artist;
    private String etc;
}