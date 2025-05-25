package dev.ryone.trdst.infrastructure.web.entrypoint.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserUserResponse
 */

@JsonTypeName("User.UserResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-25T05:15:48.251363461Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class UserUserResponse {

  private String message;

  public UserUserResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserUserResponse(String message) {
    this.message = message;
  }

  public UserUserResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @NotNull 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserResponse userUserResponse = (UserUserResponse) o;
    return Objects.equals(this.message, userUserResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
  public static class Builder {

    private UserUserResponse instance;

    public Builder() {
      this(new UserUserResponse());
    }

    protected Builder(UserUserResponse instance) {
      this.instance = instance;
    }

    protected Builder copyOf(UserUserResponse value) { 
      this.instance.setMessage(value.message);
      return this;
    }

    public UserUserResponse.Builder message(String message) {
      this.instance.message(message);
      return this;
    }
    
    /**
    * returns a built UserUserResponse instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserUserResponse build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static UserUserResponse.Builder builder() {
    return new UserUserResponse.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public UserUserResponse.Builder toBuilder() {
    UserUserResponse.Builder builder = new UserUserResponse.Builder();
    return builder.copyOf(this);
  }

}

