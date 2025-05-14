package org.hkjc.alley_oop.cicddemo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DemoResponse implements Serializable{
    private String msg;
    private String code;
}