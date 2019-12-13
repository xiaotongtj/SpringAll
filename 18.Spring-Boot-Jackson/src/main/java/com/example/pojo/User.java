package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import java.util.Date;

//@JsonIgnoreProperties({ "password", "age" })
//[{"user_name":"mrbird","age":26,"password":"123456","birthday":"2019-12-12 22:37:02"}]
//[{"userName":"mrbird","age":26,"password":"123456","birthday":"2019-12-12 22:39:07"}]
//@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
//@JsonSerialize(using = UserSerializer.class)
//@JsonDeserialize (using = UserDeserializer.class)
public class User implements Serializable {

    private static final long serialVersionUID = 6222176558369919436L;

    public interface UserNameView {
    }

    ;

    public interface AllUserFieldView extends UserNameView {
    }

    ;

    @JsonView(UserNameView.class)
    private String userName;

    @JsonView(AllUserFieldView.class)
    private int age;

    @JsonIgnore
    //@JsonView(AllUserFieldView.class) 和@JsonIgnore不能连用
    private String password;

    //[{"userName":"mrbird","age":26}]
    //[{"userName":"mrbird","age":26,"password":"123456","bth":"2019-12-12"}]
    @JsonProperty(value = "bth", access = JsonProperty.Access.READ_WRITE)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @JsonView(AllUserFieldView.class)
    private Date birthday;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
