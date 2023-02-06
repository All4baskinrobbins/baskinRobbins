package baskin.back.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    @Pattern(regexp = "[a-zA-Z0-9]]{4,12}", message = "아이디는 영어 대소문자, 숫자를 이용하여 4자 이상 12자 이하로 적어주세요")
    private String userid;
    @NotBlank
    @Pattern(regexp = "[a-zA-Z0-9]{8,12}", message = "비밀번호는 영어 대소문자, 숫자를 이용하여 8자 이상 12자 이하로 적어주세요")
    private String userpw;

    private Long birth;
    @NotBlank
    private String email;
    @NotBlank
    private String phonenumber;

}
