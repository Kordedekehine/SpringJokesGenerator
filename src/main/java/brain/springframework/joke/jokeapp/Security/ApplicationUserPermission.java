package brain.springframework.joke.jokeapp.Security;

public enum ApplicationUserPermission {
    ADMIN("chucknorris"),
    BASE("chucknorris");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }


    public String getPermission() {
        return permission;
    }
}
