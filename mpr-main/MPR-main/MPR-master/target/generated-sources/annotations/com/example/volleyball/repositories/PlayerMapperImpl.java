package com.example.volleyball.repositories;

import com.example.volleyball.models.Player;
import com.example.volleyball.models.PlayerRequest;
import com.example.volleyball.models.PlayerResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T17:36:10+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
public class PlayerMapperImpl implements PlayerMapper {

    @Override
    public Player mapToPlayer(PlayerRequest playerRequest) {
        if ( playerRequest == null ) {
            return null;
        }

        Player player = new Player();

        player.setName( playerRequest.getPlayerName() );
        player.setSurname( playerRequest.getSurname() );
        player.setAge( playerRequest.getAge() );
        player.setHeight( playerRequest.getHeight() );
        player.setRole( playerRequest.getRole() );
        player.setGender( playerRequest.getGender() );

        return player;
    }

    @Override
    public PlayerResponse mapToPlayerResponse(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerResponse playerResponse = new PlayerResponse();

        playerResponse.setId( player.getId() );
        playerResponse.setName( player.getName() );
        playerResponse.setAge( player.getAge() );
        playerResponse.setHeight( player.getHeight() );
        playerResponse.setRole( player.getRole() );
        playerResponse.setGender( player.getGender() );

        return playerResponse;
    }
}
