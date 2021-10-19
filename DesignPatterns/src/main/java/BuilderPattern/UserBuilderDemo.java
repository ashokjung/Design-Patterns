package BuilderPattern;

public class UserBuilderDemo {

    public static void main(String[] args){
        User.UserBuilder builder = new User.UserBuilder();
        builder.firstName("Ashok Jung")
                .lastName("Bahadur")
                .phone("8095713751")
                .address("bangalore")
                .age(32);

        User user = builder.build();

        User.UserBuilder anotherUser = new User.UserBuilder();
        anotherUser.firstName("Tom")
                .lastName("Mac")
                .age(39)
                .phone("8888888895")
                .address("home")
                .build();

        System.out.println(builder);
        System.out.println(user.toString());
        System.out.println(anotherUser);
        System.out.println(anotherUser.toString());




    }
}
