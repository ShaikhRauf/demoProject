/*
 * Copyright (C) 2012-2016 The Android Money Manager Ex Project Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.money.manager.ex.settings;

import android.content.Context;

import com.money.manager.ex.R;

/**
 * Encapsulates Dropbox settings.
 *
 * Created by Alen Siljak on 23/07/2015.
 */
public class DropboxSettings
    extends SettingsBase {

    public DropboxSettings(Context context) {
        super(context);

    }

    public boolean getShouldSyncOnWifi() {
        boolean result = getSharedPreferences().getBoolean(
                mContext.getString(R.string.pref_sync_via_wifi), false);
        return result;
    }

    public boolean getImmediatelyUploadChanges() {
        boolean result = getSharedPreferences().getBoolean(
                mContext.getString(R.string.pref_dropbox_upload_immediate), true);
        return result;
    }

//    public void setOauth2Token(String value) {
//        set(PreferenceConstants.PREF_DROPBOX_OAUTH2_TOKEN, value);
//    }
}
