package java_0420;

import java.util.HashMap;
import java.util.List;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class Solution04 {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map = new HashMap<>();
        for (Employee e:employees){
            map.put(e.id,e);
        }
        return help(map,id);
    }

    private int help(HashMap<Integer, Employee> map, int id) {
        Employee employee = map.get(id);
        int count = employee.importance;
        for (Integer i:employee.subordinates){
            count+=help(map,i);
        }
        return count;
    }
}
