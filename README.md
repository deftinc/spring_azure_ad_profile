# Azure AD Test App

### Running the server
```
AUTH_CLIENT_SECRET=<insert_client_secret_here> mvn spring-boot:run -Dspring.profiles.active=secure
```

### Endpoints

http://localhost:8080 should redirect you to auth.

UserPrincipal can be found at http://localhost:8080/user
