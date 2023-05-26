/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.dao;

import java.util.List;



/**
 *
 * @author LENOVO T560
 */
public abstract class EduSysDAO<Entity, Key> {

    abstract public void insert(Entity entity);
    abstract public void update(Entity entity);
    abstract public void delete(Key key);
    abstract public List<Entity> selectALL();
    abstract public Entity sellectById(Key key);
    abstract protected List<Entity> selectBySQL(String sql,Object...args);
    
}
