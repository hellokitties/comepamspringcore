public class Client {
    String id;
    String fullName;

    Client(String id, String fullName){
        this.fullName =fullName;
        this.id= id;
    }

    public String getId(){
        return this.id;
    }

    public String getFullName(){
        return this.fullName;
    }

}
