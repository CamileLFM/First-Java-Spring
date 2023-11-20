package com.camile.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK pKey = new BelongingPK();

    private Integer position;

    public Belonging(Game game, GameList gamelist, Integer position){
        pKey.setGame(game);
        pKey.setGameList(gamelist);
        this.position = position;
    }

    public BelongingPK getpKey() {
        return pKey;
    }

    public void setpKey(BelongingPK pKey) {
        this.pKey = pKey;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pKey == null) ? 0 : pKey.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Belonging other = (Belonging) obj;
        if (pKey == null) {
            if (other.pKey != null)
                return false;
        } else if (!pKey.equals(other.pKey))
            return false;
        return true;
    }
}
