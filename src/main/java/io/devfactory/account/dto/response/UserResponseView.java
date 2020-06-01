package io.devfactory.account.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class UserResponseView {

  private Long id;
  private String username;
  private String email;
  private int age;
  private String roleName;

  @Builder(builderMethodName = "of")
  private UserResponseView(Long id, String username, String email, int age, String roleName) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.age = age;
    this.roleName = roleName;
  }

}
