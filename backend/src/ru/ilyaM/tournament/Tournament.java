package ru.ilyaM.tournament;

import ru.ilyaM.player.PlayerInfo;
import ru.ilyaM.player.Rank;
import ru.ilyaM.tournament.games.Game;

import java.util.Date;
import java.util.List;

public class Tournament {
    private Date dateStart;
    private Date dateEnd;
    private int playersCount;
    private int gameCount;
    private List<Game> games;
    private List<PlayerInfo> players;
    private List<Rank> ranks; //todo спросить про ранги!!!!

}
