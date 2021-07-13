package models;

import enums.GenderEnum;
import enums.RankEnum;
import enums.RoleEnum;
import enums.StateEnum;
import org.jetbrains.annotations.Nullable;

public class PlayerInfo extends UserInfo {
    private int valueRank;
    private RankEnum rank;
    private UserInfo trainer;
    private StateEnum state;

    public PlayerInfo(String email, String password, RoleEnum role, String name, String phone, String dateOfBirth, String nickname, int cityId, GenderEnum gender, int valueRank, RankEnum rank, @Nullable UserInfo trainer, StateEnum state) {
        super(email, password, role, name, phone, dateOfBirth, nickname, cityId, gender);
        this.valueRank = valueRank;
        this.rank = rank;
        this.trainer = trainer;
        this.state = state;
    }

    public PlayerInfo(int valueRank, RankEnum rank, @Nullable UserInfo trainer, StateEnum state) {
        super(null, null, null, null, -1, null);
        this.valueRank = valueRank;
        this.rank = rank;
        this.trainer = trainer;
        this.state = state;
    }

    public int getValueRank() {
        return valueRank;
    }

    public void setValueRank(int valueRank) {
        this.valueRank = valueRank;
    }

    public RankEnum getRank() {
        return rank;
    }

    public void setRank(RankEnum rank) {
        this.rank = rank;
    }

    public UserInfo getTrainer() {
        return trainer;
    }

    public void setTrainer(UserInfo trainer) {
        this.trainer = trainer;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }
}
