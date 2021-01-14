package br.paduan.spring02.dto;

import br.paduan.spring02.model.User;

public class UserDTO {
    private String name;
    private String email;

    public UserDTO(User user){
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
