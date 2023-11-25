package com.habitrpg.common.habitica.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.helpers.KeyHelper;
import qc.q;
import yc.v;

/* compiled from: HostConfig.kt */
/* loaded from: classes4.dex */
public final class HostConfig {
    private String address;
    private String apiKey;
    private String port;
    private String userID;

    public HostConfig(String str, String str2) {
        q.i(str, "userID");
        q.i(str2, "apiKey");
        this.port = "80";
        this.address = "https://habitica.com";
        this.userID = str;
        this.apiKey = str2;
    }

    private final String loadAPIKey(SharedPreferences sharedPreferences, KeyHelper keyHelper) {
        boolean u10;
        boolean u11;
        boolean z10 = false;
        String str = null;
        if (sharedPreferences.contains(this.userID)) {
            String string = sharedPreferences.getString(this.userID, null);
            if (string != null) {
                u11 = v.u(string);
                if ((!u11) == true) {
                    z10 = true;
                }
            }
            if (!z10) {
                str = "";
            } else if (keyHelper != null) {
                str = keyHelper.decrypt(string);
            }
        } else {
            String string2 = sharedPreferences.getString("APIToken", null);
            if (string2 != null) {
                u10 = v.u(string2);
                if ((!u10) == true) {
                    z10 = true;
                }
            }
            if (z10 && Build.VERSION.SDK_INT >= 23) {
                if (keyHelper != null) {
                    str = keyHelper.encrypt(string2);
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(this.userID, str);
                edit.remove("APIToken");
                edit.apply();
            }
            str = string2;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getPort() {
        return this.port;
    }

    public final String getUserID() {
        return this.userID;
    }

    public final boolean hasAuthentication() {
        boolean z10;
        boolean z11;
        if (this.userID.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.apiKey.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public final void setAddress(String str) {
        q.i(str, "<set-?>");
        this.address = str;
    }

    public final void setApiKey(String str) {
        q.i(str, "<set-?>");
        this.apiKey = str;
    }

    public final void setPort(String str) {
        q.i(str, "<set-?>");
        this.port = str;
    }

    public final void setUserID(String str) {
        q.i(str, "<set-?>");
        this.userID = str;
    }

    public HostConfig(SharedPreferences sharedPreferences, KeyHelper keyHelper, Context context) {
        q.i(sharedPreferences, "sharedPreferences");
        q.i(context, "context");
        this.port = "80";
        String string = sharedPreferences.getString("server_url", null);
        if (!(string == null || string.length() == 0)) {
            this.address = string;
        } else {
            String string2 = context.getString(R.string.base_url);
            q.h(string2, "getString(...)");
            this.address = string2;
        }
        String string3 = sharedPreferences.getString(context.getString(R.string.SP_userID), null);
        this.userID = string3 == null ? "" : string3;
        this.apiKey = loadAPIKey(sharedPreferences, keyHelper);
    }

    public HostConfig(String str, String str2, String str3, String str4) {
        q.i(str, "address");
        q.i(str2, "port");
        q.i(str3, "api");
        q.i(str4, "user");
        this.address = str;
        this.port = str2;
        this.apiKey = str3;
        this.userID = str4;
    }
}
