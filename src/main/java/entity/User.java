package entity;

public class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int id;

    //private Song featuredSong;
    //private ArrayList<Event> pastEvents;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public ArrayList<Event> getPastEvents() {
//        return pastEvents;
//    }

//    public void setPastEvents(ArrayList<Event> pastEvents) {
//        this.pastEvents = pastEvents;
//    }
}