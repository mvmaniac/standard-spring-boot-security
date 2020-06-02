package io.devfactory.account.dto.response;

import static lombok.AccessLevel.PRIVATE;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class UserResponseView {

  private Long id;
  private String username;
  private String email;
  private int age;
  private String roleName;
  private LocalDateTime createdDate;
  private LocalDateTime updatedDate;

  @Builder(builderMethodName = "create")
  private UserResponseView(Long id, String username, String email, int age, String roleName,
      LocalDateTime createdDate, LocalDateTime updatedDate) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.age = age;
    this.roleName = roleName;
    this.createdDate = createdDate;
    this.updatedDate = updatedDate;
  }

}
