/*
 * Copyright (C) 2015 mafiagame.ir
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package co.mafiagame.engine.command.context;

import co.mafiagame.common.channel.InterfaceContext;
import co.mafiagame.engine.domain.Game;

/**
 * @author hekmatof
 * @author nazila
 */
public class DetectiveAskCommandContext extends CommandContext {
    private final String username;
    private final String who;

    public DetectiveAskCommandContext(InterfaceContext interfaceContext,
                                      Game game, String username, String who) {
        super(interfaceContext, game);
        this.username = username;
        this.who = who;
    }

    public String getUsername() {
        return username;
    }


    public String getWho() {
        return who;
    }

    @Override
    public String toString() {
        return "detectiveAskCommandContext{" + "username='" + username + '\''
                + ", who='" + who + '\'' + '}';
    }
}
