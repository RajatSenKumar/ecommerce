package com.blog;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainUtil {
    public static void main(String[] args) {

//        Predicate<Integer> condition = x->x>0;
//        boolean val = condition.test(100);
//        System.out.println(val);


//        Predicate<String> condition = x->x.equals("mike");
//        boolean val = condition.test("mike");
//        System.out.println(val);


//        List<Integer> data = Arrays.asList(10,20,30,5,50,100);
//        List<Integer> newData = data.stream().filter(x -> x > 20).collect(Collectors.toList());
//        System.out.println(newData);


//        List<String> data = Arrays.asList("mike","stallin","mithun","adam","smith","michael");
//        List<String> newData = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newData);


//        List<String> data = Arrays.asList("mike","stallin","mithun","adam","smith","michael");
//        List<String> newData = data.stream().filter(x -> x.endsWith("n")).collect(Collectors.toList());
//        System.out.println(newData);


//        List<String> data = Arrays.asList("mike","stallin","mithun","mike","smith","michael");
//        List<String> newData = data.stream().filter(x -> x.equals("mike")).collect(Collectors.toList());
//        System.out.println(newData);


//        List<String> data = Arrays.asList("mike","stallin","mithun","mike","smith","michael");
//        List<String> newData = data.stream().filter(x -> x.equals("mike")).collect(Collectors.toList());
//        System.out.println(newData.size());


//        Employee emp1 = new Employee();
//        emp1.setName("mike");
//        emp1.setSalary(1000);
//        emp1.setCity("bengaluru");
//        Employee emp2 = new Employee();
//        emp2.setName("stallin");
//        emp2.setSalary(2000);
//        emp2.setCity("mumbai");
//        Employee emp3 = new Employee();
//        emp3.setName("adam");
//        emp3.setSalary(3000);
//        emp3.setCity("delhi");
//        Employee emp4 = new Employee();
//        emp4.setName("mithun");
//        emp4.setSalary(4000);
//        emp4.setCity("kolkata");
//        Employee emp5 = new Employee();
//        emp5.setName("john");
//        emp5.setSalary(5000);
//        emp5.setCity("chennai");
//        List<Employee> data = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
//        List<Employee> newData = data.stream().filter(x ->x.getSalary()==3000).collect(Collectors.toList());
//        List<Employee> newData = data.stream().filter(x ->x.getCity().equals("delhi")).collect(Collectors.toList());
//        List<Employee> newData = data.stream().filter(x ->x.getCity().equalsIgnoreCase("delhi")).collect(Collectors.toList());
//        System.out.println(newData);
//        System.out.println(newData.size());
//        for (Employee details:newData){
//            System.out.println(details.getName());
//            System.out.println(details.getSalary());
//            System.out.println(details.getCity());
//        }


//        List<Integer> data = Arrays.asList(10,5,2,20);
//        List<Integer> newData = data.stream().map(x->x*x).collect(Collectors.toList());
//        List<Integer> newData = data.stream().map(x->x/x).collect(Collectors.toList());
//        List<Integer> newData = data.stream().map(x->x+x).collect(Collectors.toList());
//        List<Integer> newData = data.stream().map(x->x-x).collect(Collectors.toList());
//        System.out.println(newData);


//        List<Double> data = Arrays.asList(10.0,5.0,2.0,20.0);
//        List<Double> newData = data.stream().map(x->x*x).collect(Collectors.toList());
//        List<Double> newData = data.stream().map(x->x/x).collect(Collectors.toList());
//        List<Double> newData = data.stream().map(x->x+x).collect(Collectors.toList());
//        List<Double> newData = data.stream().map(x->x-x).collectors.toList());
//        System.out.println(newData);


//        List<Integer> data = Arrays.asList(10,20,30,5,50,100);
//        List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);


//        List<String> data = Arrays.asList("mike","stallin","mithun","adam","smith","michael");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);


//        List<Integer> data = Arrays.asList(10,20,30,5,50,100,10,20,55,50,78);
//        List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);


//        MainUtil mainUtil = new MainUtil();
//        Post post1 = new Post();
//        post1.setId(1);
//        post1.setTitle("aaa");
//        post1.setContent("aaa");
//        Post post2 = new Post();
//        post2.setId(2);
//        post2.setTitle("bbb");
//        post2.setContent("bbb");
//        Post post3 = new Post();
//        post3.setId(3);
//        post3.setTitle("ccc");
//        post3.setContent("ccc");
//        PostDto dto1 = mapToDto(post1);
//        PostDto dto2 = mapToDto(post2);
//        PostDto dto3 = mapToDto(post3);
//        List<Post> posts = Arrays.asList(post1, post2, post3);
//        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList()); //this lambdas expression will call only static method only
//        List<PostDto> dtos = posts.stream().map(MainUtil::mapToDto).collect(Collectors.toList()); //Mainutil is the method reference which used in place of lambdas expression to call static method only
//        List<PostDto> dtos = posts.stream().map(mainUtil::mapToDto).collect(Collectors.toList()); //mainutil is the method reference which used in place of lambdas expression to call nonstatic method only
//        System.out.println(dtos);
//    }
//      static PostDto mapToDto(Post post){
//      PostDto mapToDto(Post post){
//        PostDto dto = new PostDto();
//        dto.setId(post.getId());
//        dto.setTitle(post.getTitle());
//        dto.setContent(post.getContent());
//        return dto;


//        Movie m1 = new Movie("aaa",8,1999);
//        Movie m2 = new Movie("bbb",9,2000);
//        Movie m3 = new Movie("ccc",10,2001);
//        ArrayList<Movie> list = new ArrayList<Movie>();
//        list.add(m1);
//        list.add(m2);
//        list.add(m3);
//        Collections.sort(list);
//        MovieYear movieYear = new MovieYear();
//        Collections.sort(list,movieYear);
//        MovieRating movieRating = new MovieRating();
//        Collections.sort(list,movieRating);
//        MovieName movieName = new MovieName();
//        Collections.sort(list,movieName);
//        for (Movie m:list){
//            System.out.println(m.getName());
//            System.out.println(m.getRating());
//            System.out.println(m.getYear());
//        }


//        List<Integer> numbers = Arrays.asList(10,20,30,5,50,100);
//        Integer max = numbers.stream().max(Integer::compareTo).get();
//        Integer min = numbers.stream().min(Integer::compareTo).get();
//        System.out.println(max);
//        System.out.println(min);


//        List<User> names = Arrays.asList(new User(1,"xyz"), new User(2,"abc"));
//        User user1 = names.stream().max(User::compareTo).get();
//        User user2 = names.stream().min(User::compareTo).get();
//        System.out.println(user1.getId());
//        System.out.println(user1.getName());
//        System.out.println(user2.getId());
//        System.out.println(user2.getName());


//        List<Job> data = Arrays.asList(new Job("mike",5000), new Job("stallin",10000), new Job("adam",5000));
//        Map<Double, List<Job>> groups = data.stream().collect(Collectors.groupingBy(Job::getSalary));
//        System.out.println(groups);
//       for (Map.Entry<Double, List<Job>> entry:groups.entrySet()){
//           double salary = entry.getKey();
//           List<Job> names = entry.getValue();
//           System.out.println("Employee with salary:"+salary+":");
//           for (Job x:names) {
//               System.out.println("\t"+x.getName());
//           }
//    }
//        Map<String, List<Job>> groups = data.stream().collect(Collectors.groupingBy(Job::getName));
//        System.out.println(groups);
//        for (Map.Entry<String, List<Job>> entry:groups.entrySet()){
//            String names = entry.getKey();
//            List<Job> salary = entry.getValue();
//            System.out.println("Employee with name:"+name+":");
//            for (Job x:salary) {
//                System.out.println("\t"+x.getSalary());
//            }
//      }


//    int x=10;
//    int y=20;
//    ternary operator: result=(condition)?exp1:exp2 means if condition will true go to exp1 otherwise will go to exp2
//    int max=(x>y)?x:y;
//    System.out.println(max);


//        MainUtil mainUtil = new MainUtil();
//        mainUtil.test();
//    }
//    public void test() {
//        System.out.println(100);
//    }
//        new MainUtil().test().test2();
//    }
//    public MainUtil test() {
//        return new MainUtil();
//    }
//    public void test2(){
//        System.out.println(200);
//    }


        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("testing"));
    }

}
