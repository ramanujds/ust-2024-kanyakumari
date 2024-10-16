## Spring Validations

**Add the following dependency**

```xml
<dependency> 
    <groupId>org.springframework.boot</groupId> 
    <artifactId>spring-boot-starter-validation</artifactId> 
</dependency>
```

* @NotNull: Validates that the annotated property value is not null.
* @AssertTrue: Validates that the annotated property value is true.
* @Size: Validates that the annotated property value has a size between the attributes min and max. It can be applied to String, Collection, Map, and array properties.
* @Min: Validates that the annotated property has a value no smaller than the value attribute.
* @Max: Validates that the annotated property has a value no larger than the value attribute.
* @Email: Validates that the annotated property is a valid email address.

Some annotations accept additional attributes, but the message attribute is common to all of them. This is the message that will usually be rendered when the value of the respective property fails validation.

Additionally, some annotations that can be found in the JSR are:

* @NotEmpty: Validates that the property is not null or empty; can be applied to String, Collection, Map, or Array values.
* @NotBlank: Can be applied only to text values and validates that the property is not null or whitespace.
* @Positive and @PositiveOrZero: Apply to numeric values and validate that they are strictly positive, or positive including 0.
* @Negative and @NegativeOrZero: Apply to numeric values and validate that they are strictly negative, or negative including 0.
* @Past and @PastOrPresent: Validate that a date value is in the past or the past including the present; can be applied to date types including those added in Java 8.
* @Future and @FutureOrPresent: Validate that a date value is in the future, or in the future including the present.
