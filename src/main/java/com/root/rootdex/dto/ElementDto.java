package com.root.rootdex.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ElementDto {

        private int id;
        private String name;

        public ElementDto(int id, String name) {
                this.id = id;
                this.name = name;
        }
}