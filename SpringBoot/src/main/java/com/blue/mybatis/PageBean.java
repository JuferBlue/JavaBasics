package com.blue.mybatis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.mybatis
 * @Author: JuferBlue
 * @CreateTime: 2024-07-28  20:43
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private Long total;
    private List rows;
}
