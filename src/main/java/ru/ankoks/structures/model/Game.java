package ru.ankoks.structures.model;


import java.util.Iterator;

public class Game implements Iterable<Player> {

    private final Player[] players;

    private final Field field;

    private final String name;

    public Game(final Player[] players,
                final Field field,
                final String name) {
        this.players = players;
        this.field = field;
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<Player> iterator() {
//        final List<Player> playersList = Arrays.asList(players);
//        return playersList.iterator();

        return new PlayerIterator(players);
    }

    private static class PlayerIterator implements Iterator<Player>{
        private int index = 0;

        private final Player[] players;

        private PlayerIterator(Player[] players) {
            this.players = players;
        }

        @Override
        public boolean hasNext() {
            return players.length > index;
        }

        @Override
        public Player next() {
            return players[index++];
        }
    }
}
