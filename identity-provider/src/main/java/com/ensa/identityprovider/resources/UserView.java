package com.ensa.identityprovider.resources;

import com.ensa.identityprovider.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserView {

    private String email;

    public static UserView from(User user) {
        return new UserViewBuilder()
                .email(user.getEmail()).build();
    }

    public static User to(UserView userView) {
        return new User(null, userView.getEmail());
    }
}