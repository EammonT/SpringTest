package SpringTest.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1数组类型
    private String[] courses;
    //2集合类型
    private List<Course> courselist;
    //3map类型
    private Map<String,String> maps;
    //4set类型
    private Set<String> sets;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setCourselist(List<Course> courselist) {
        this.courselist = courselist;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(courselist);
        System.out.println(maps);
        System.out.println(sets);
    }
}
