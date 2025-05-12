// Source code is decompiled from a .class file using FernFlower decompiler.
package com.devmosaic.arogyatejas.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@Data
@AllArgsConstructor
public class DoctorRegistrationDto {
   private @NotBlank(message = "First name is required") String firstName;
   private @NotBlank(message = "Last name is required") String lastName;
   private @NotBlank(message = "Password is required") @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$", message = "Password must contain at least 6 characters, including uppercase, lowercase, number, and special character") String password;
   private @NotNull(message = "Date of birth is required") @Past(message = "Date of birth must be in the past") LocalDate dob;
   private @NotBlank(message = "Email is required") @Email(message = "Invalid email format") String email;
   private @NotBlank(message = "Phone number is required") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9") String phone;
   private @NotBlank(message = "Gender is required") @Pattern(regexp = "^(?i)(male|female|other)$", message = "Gender must be Male, Female, or Other") String gender;
   private @NotBlank(message = "Specialization is required") String specialization;
   private @NotNull(message = "Experience is required") @Min(value = 0L, message = "Experience cannot be negative") Integer experience;
   private @NotBlank(message = "Address is required") String address;
}
