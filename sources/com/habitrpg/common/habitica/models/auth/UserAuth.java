package com.habitrpg.common.habitica.models.auth;

import qc.h;

/* compiled from: UserAuth.kt */
/* loaded from: classes4.dex */
public final class UserAuth {
    private String confirmPassword;
    private String email;
    private String password;
    private String username;

    public UserAuth() {
        this(null, null, null, null, 15, null);
    }

    public final String getConfirmPassword() {
        return this.confirmPassword;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setConfirmPassword(String str) {
        this.confirmPassword = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public UserAuth(String str, String str2, String str3, String str4) {
        this.username = str;
        this.password = str2;
        this.confirmPassword = str3;
        this.email = str4;
    }

    public /* synthetic */ UserAuth(String str, String str2, String str3, String str4, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
