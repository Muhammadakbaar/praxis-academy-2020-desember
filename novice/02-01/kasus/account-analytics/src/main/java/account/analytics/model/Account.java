package account.analytics.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "email")
public class Account {
    public static Function getBalance;
	private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;
    private Sex sex;
    private LocalDate creationDate;
    private BigDecimal balance = BigDecimal.ZERO;
}

