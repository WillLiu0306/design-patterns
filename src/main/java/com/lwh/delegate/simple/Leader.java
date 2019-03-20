package com.lwh.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{
    private Map<String,IEmployee> map = new HashMap<String,IEmployee>();

    public Leader(){
        map.put("加密",new EmployeeA());
        map.put("架构",new EmployeeB());

    }

    public void work(String command){
        map.get(command).work(command);
    }
}

