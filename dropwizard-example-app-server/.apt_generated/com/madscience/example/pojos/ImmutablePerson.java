package com.madscience.example.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ExamplePerson}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePerson.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@SuppressFBWarnings
@Generated({"Immutables.generator", "Person"})
@Immutable
final class ImmutablePerson extends ExamplePerson {
  private final int age;
  private final String firstName;
  private final String gender;
  private final String lastName;

  private ImmutablePerson(int age, String firstName, String gender, String lastName) {
    this.age = age;
    this.firstName = Preconditions.checkNotNull(firstName, "firstName");
    this.gender = Preconditions.checkNotNull(gender, "gender");
    this.lastName = Preconditions.checkNotNull(lastName, "lastName");
  }

  private ImmutablePerson(
      ImmutablePerson original,
      int age,
      String firstName,
      String gender,
      String lastName) {
    this.age = age;
    this.firstName = firstName;
    this.gender = gender;
    this.lastName = lastName;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @JsonProperty
  @Override
  public int getAge() {
    return age;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @JsonProperty
  @Override
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty
  @Override
  public String getGender() {
    return gender;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @JsonProperty
  @Override
  public String getLastName() {
    return lastName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExamplePerson#getAge() age} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withAge(int value) {
    if (this.age == value) return this;
    return new ImmutablePerson(this, value, this.firstName, this.gender, this.lastName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExamplePerson#getFirstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withFirstName(String value) {
    if (this.firstName.equals(value)) return this;
    return new ImmutablePerson(
        this,
        this.age,
        Preconditions.checkNotNull(value, "firstName"),
        this.gender,
        this.lastName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExamplePerson#getGender() gender} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gender
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withGender(String value) {
    if (this.gender.equals(value)) return this;
    return new ImmutablePerson(
        this,
        this.age,
        this.firstName,
        Preconditions.checkNotNull(value, "gender"),
        this.lastName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExamplePerson#getLastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withLastName(String value) {
    if (this.lastName.equals(value)) return this;
    return new ImmutablePerson(
        this,
        this.age,
        this.firstName,
        this.gender,
        Preconditions.checkNotNull(value, "lastName"));
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
    return age == another.age
        && firstName.equals(another.firstName)
        && gender.equals(another.gender)
        && lastName.equals(another.lastName);
  }

  /**
   * Computes a hash code from attributes: {@code age}, {@code firstName}, {@code gender}, {@code lastName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + age;
    h = h * 17 + firstName.hashCode();
    h = h * 17 + gender.hashCode();
    h = h * 17 + lastName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Person")
        .add("age", age)
        .add("firstName", firstName)
        .add("gender", gender)
        .add("lastName", lastName)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json extends ExamplePerson {
    @Nullable Integer age;
    @Nullable String firstName;
    @Nullable String gender;
    @Nullable String lastName;
    @JsonProperty
    public void setAge(int age) {
      this.age = age;
    }
    @JsonProperty
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
    @JsonProperty
    public void setGender(String gender) {
      this.gender = gender;
    }
    @JsonProperty
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
    @Override
    public int getAge() { throw new UnsupportedOperationException(); }
    @Override
    public String getFirstName() { throw new UnsupportedOperationException(); }
    @Override
    public String getGender() { throw new UnsupportedOperationException(); }
    @Override
    public String getLastName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static ImmutablePerson fromJson(Json json) {
    ImmutablePerson.Builder builder = ImmutablePerson.builder();
    if (json.age != null) {
      builder.age(json.age);
    }
    if (json.firstName != null) {
      builder.firstName(json.firstName);
    }
    if (json.gender != null) {
      builder.gender(json.gender);
    }
    if (json.lastName != null) {
      builder.lastName(json.lastName);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Person} instance.
   * @param age The value for the {@code age} attribute
   * @param firstName The value for the {@code firstName} attribute
   * @param gender The value for the {@code gender} attribute
   * @param lastName The value for the {@code lastName} attribute
   * @return An immutable Person instance
   */
  public static ImmutablePerson of(int age, String firstName, String gender, String lastName) {
    return new ImmutablePerson(age, firstName, gender, lastName);
  }

  /**
   * Creates an immutable copy of a {@link ExamplePerson} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person instance
   */
  public static ImmutablePerson copyOf(ExamplePerson instance) {
    if (instance instanceof ImmutablePerson) {
      return (ImmutablePerson) instance;
    }
    return ImmutablePerson.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson ImmutablePerson}.
   * @return A new ImmutablePerson builder
   */
  public static ImmutablePerson.Builder builder() {
    return new ImmutablePerson.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson ImmutablePerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  static final class Builder {
    private static final long INIT_BIT_AGE = 0x1L;
    private static final long INIT_BIT_FIRST_NAME = 0x2L;
    private static final long INIT_BIT_GENDER = 0x4L;
    private static final long INIT_BIT_LAST_NAME = 0x8L;
    private long initBits = 0xf;

    private int age;
    private @Nullable String firstName;
    private @Nullable String gender;
    private @Nullable String lastName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ExamplePerson instance) {
      Preconditions.checkNotNull(instance, "instance");
      age(instance.getAge());
      firstName(instance.getFirstName());
      gender(instance.getGender());
      lastName(instance.getLastName());
      return this;
    }

    /**
     * Initializes the value for the {@link ExamplePerson#getAge() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(int age) {
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the value for the {@link ExamplePerson#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstName(String firstName) {
      this.firstName = Preconditions.checkNotNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ExamplePerson#getGender() gender} attribute.
     * @param gender The value for gender 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gender(String gender) {
      this.gender = Preconditions.checkNotNull(gender, "gender");
      initBits &= ~INIT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the value for the {@link ExamplePerson#getLastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastName(String lastName) {
      this.lastName = Preconditions.checkNotNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson ImmutablePerson}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson(null, age, firstName, gender, lastName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_GENDER) != 0) attributes.add("gender");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
  }
}
