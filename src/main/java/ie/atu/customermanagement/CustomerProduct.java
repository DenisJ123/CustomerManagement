package ie.atu.customermanagement;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Id cannot be blank")
    private Long id;

    @NotBlank(message = "First name must not be empty")
    private String fname;

    @NotBlank(message = "Last name must not be empty")
    private String lname;

    @NotBlank(message = "Email must be valid")
    private String email;

    @Min(value = 9, message = "Phone number not long enough")
    @Max(value = 10, message = "Phone number too long")
    private int phoneNumber;

    @Min(value = 2006, message = "Customer too young")
    @Max(value = 2025, message = "That birthdate is in the future")
    private int dob;

}
