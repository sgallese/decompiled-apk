package com.habitrpg.android.habitica.modules;

import android.content.SharedPreferences;
import dd.g;
import dd.i;
import dd.n0;
import dd.x;
import qc.q;

/* compiled from: UserModule.kt */
/* loaded from: classes4.dex */
public final class AuthenticationHandler {
    public static final int $stable = 8;
    private final x<String> _userIDFlow;
    private final g<String> userIDFlow;

    public AuthenticationHandler(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "sharedPreferences");
        x<String> a10 = n0.a(null);
        this._userIDFlow = a10;
        this.userIDFlow = i.u(a10);
        String string = sharedPreferences.getString("UserID", "");
        a10.setValue(string != null ? string : "");
    }

    public final String getCurrentUserID() {
        return this._userIDFlow.getValue();
    }

    public final g<String> getUserIDFlow() {
        return this.userIDFlow;
    }

    public final boolean isAuthenticated() {
        if (getCurrentUserID() != null) {
            return true;
        }
        return false;
    }

    public final void updateUserID(String str) {
        q.i(str, "userID");
        this._userIDFlow.setValue(str);
    }

    public AuthenticationHandler(String str) {
        q.i(str, "userID");
        x<String> a10 = n0.a(null);
        this._userIDFlow = a10;
        this.userIDFlow = i.u(a10);
        a10.setValue(str);
    }
}
