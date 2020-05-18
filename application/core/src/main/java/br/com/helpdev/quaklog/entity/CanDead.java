package br.com.helpdev.quaklog.entity;

import br.com.helpdev.quaklog.entity.vo.GameTime;
import br.com.helpdev.quaklog.entity.vo.Mod;

public interface CanDead {
    void deadBy(GameTime gameTime, Player player, Mod mod);
}
