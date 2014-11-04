// {LICENSE}
/*
 * Copyright 2013-2014 HeroesGrave and other Paint.JAVA developers.
 * 
 * This file is part of Paint.JAVA
 * 
 * Paint.JAVA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package heroesgrave.paint.gui.colorchooser.event;

import heroesgrave.paint.gui.colorchooser.Channel;

/**
 * @author BurntPizza
 *
 */
public interface ColourEventBroadcaster
{
	public void addColorListener(ColourListener c);
	
	public void removeColorListener(ColourListener c);
	
	public void broadcastChanges(ColourListener source);
	
	public void makeChange(Object source, Channel channel, int val, boolean primary);
}