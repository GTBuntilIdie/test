package com.tamerlanishmaev.microbank.entity;

import com.tamerlanishmaev.microbank.entityListener.UserEntityListener;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@EntityListeners(UserEntityListener.class)
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JoinColumn(name = "bankAccount_id", referencedColumnName = "id")
    private BankAccount bankAccount;

    @ElementCollection
    @Column(name = "email", nullable = false, unique=true)
    private Set<String> email;

    @ElementCollection
    @Column(name = "phone", nullable = false, unique=true)
    private Set<String> phone;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "login", nullable = false, unique=true)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

}
