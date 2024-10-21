package ie.atu.customermanagement;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class CustomerProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Id cannot be blank")
    private Long id;

    @NotBlank(message = "First name must not be empty")
    private String firstname;

    @NotBlank(message = "Last name must not be empty")
    private String lastname;

    @Email(regexp = "^.+@.+$", groups = Create.class)
    private String email;

    @Min(value = 9, message = "Phone number not long enough")
    @Max(value = 10, message = "Phone number too long")
    private int phoneNumber;

    @Max(value = 2006, message = "Customer too young")
    private int dob;





}
