package ru.ilyaM.player;

import org.jetbrains.annotations.Nullable;
import ru.ilyaM.user.UserInfo;


public class PlayerInfo {
    private int rating;
    private UserInfo trainer;
    private Rank rank;
    private State state;

    public PlayerInfo(int rating) {
        this.rating = rating;

        if (rating < 1200) {
            //todo Есть ли смысл сделать пакет utils, и всё это вынести в отдельный метод???
            this.rank = Rank.NOVICES;
        } else if(rating < 1400) {
            this.rank = Rank.CLASS_D_CATEGORY_4;
        } else if (rating < 1600) {
            this.rank = Rank.CLASS_C_CATEGORY_3;
        } else if (rating < 1800) {
            this.rank = Rank.CLASS_B_CATEGORY_2;
        } else if (rating < 2000) {
            this.rank = Rank.CLASS_A_CATEGORY_1;
        } else if (rating < 2200) {
            this.rank = Rank.CANDIDATE_MASTER;
        } else if (rating < 2300) {
            this.rank = Rank.FIDE_CANDIDATE_MASTER;
        } else if (rating < 2400) {
            this.rank = Rank.FIDE_MASTERS;
        } else if (rating < 2500) {
            this.rank = Rank.INTERNATIONAL_MASTERS;
        }  else if (rating < 2700) {
            this.rank = Rank.GRANDMASTERS;
        } else if(rating >= 2700) {
            this.rank = Rank.SUPER_GRANDMASTERS;
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public UserInfo getTrainer() {
        return trainer;
    }

    public void setTrainer(UserInfo trainer) {
        this.trainer = trainer;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
