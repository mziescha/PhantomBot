/*
 * Copyright (C) 2016-2023 phantombot.github.io/PhantomBot
 *
 * This program is free software: you can redistribute it and/or modify
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gmt2001.twitch.eventsub;

import org.json.JSONObject;

import io.netty.handler.codec.http.FullHttpRequest;

/**
 * Internal event subclass denoting an EventSub revocation notification
 *
 * @author gmt2001
 */
public final class EventSubInternalRevocationEvent extends EventSubInternalEvent {
    EventSubInternalRevocationEvent(FullHttpRequest req) {
        super(req);
    }

    EventSubInternalRevocationEvent(JSONObject metadata, JSONObject payload) {
        super(metadata, payload);
    }
}