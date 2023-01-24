package encaptulationExamples;

public class Human {
    private String name;
    private String email;

    private String password;

    public Human(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name= name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(String name) {
        if(this.name == name){
            return password;

        }else{
            return "you cant access password";
        }


    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class humanDriver{
    public static void main(String[] args) {
        Human hm = new Human("rajin", "email@email.com", "java_123");
        System.out.println
                (hm.getPassword("rajin"));


    }
}
