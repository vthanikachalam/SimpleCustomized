package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contact
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-08T12:06:08.865Z")




public class Contact   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mobile")
  private String mobile = null;

  @JsonProperty("name")
  private String name = null;

  public Contact id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique id of the Contact
   * @return id
  **/
  @ApiModelProperty(value = "The unique id of the Contact")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contact mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Mobile number of the Contact
   * @return mobile
  **/
  @ApiModelProperty(value = "Mobile number of the Contact")


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Contact name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Contact
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Contact")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.id, contact.id) &&
        Objects.equals(this.mobile, contact.mobile) &&
        Objects.equals(this.name, contact.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mobile, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

