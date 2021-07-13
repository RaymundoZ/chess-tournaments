package models;

import enums.GenderEnum;
import enums.RoleEnum;

public class UserInfo extends UserAuth {
    private String name;
    private String phone;
    private String dateOfBirth;
    private String nickname;
    private int cityId;
    private GenderEnum gender;

    public UserInfo(String email, String password, RoleEnum role, String name, String phone, String dateOfBirth, String nickname, int cityId, GenderEnum gender) {
        super(email, password, role);
        this.name = name;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.nickname = nickname;
        this.cityId = cityId;
        this.gender = gender;
    }

    public UserInfo(String name, String phone, String dateOfBirth, String nickname, int cityId, GenderEnum gender) {
        super(null, null, null);
        this.name = name;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.nickname = nickname;
        this.cityId = cityId;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

}
