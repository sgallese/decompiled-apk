package com.habitrpg.android.habitica.models.auth;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.shared.habitica.models.AvatarLocalAuthentication;
import fa.c;
import io.realm.d1;
import io.realm.h2;
import io.realm.internal.o;

/* compiled from: LocalAuthentication.kt */
/* loaded from: classes4.dex */
public class LocalAuthentication extends d1 implements BaseObject, AvatarLocalAuthentication, h2 {
    public static final int $stable = 8;
    private String email;
    @c("has_password")
    private Boolean hasPassword;
    private String username;

    public LocalAuthentication() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$hasPassword(Boolean.FALSE);
    }

    public final String getEmail() {
        return realmGet$email();
    }

    public final Boolean getHasPassword() {
        return realmGet$hasPassword();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarLocalAuthentication
    public String getUsername() {
        return realmGet$username();
    }

    @Override // io.realm.h2
    public String realmGet$email() {
        return this.email;
    }

    @Override // io.realm.h2
    public Boolean realmGet$hasPassword() {
        return this.hasPassword;
    }

    @Override // io.realm.h2
    public String realmGet$username() {
        return this.username;
    }

    @Override // io.realm.h2
    public void realmSet$email(String str) {
        this.email = str;
    }

    @Override // io.realm.h2
    public void realmSet$hasPassword(Boolean bool) {
        this.hasPassword = bool;
    }

    @Override // io.realm.h2
    public void realmSet$username(String str) {
        this.username = str;
    }

    public final void setEmail(String str) {
        realmSet$email(str);
    }

    public final void setHasPassword(Boolean bool) {
        realmSet$hasPassword(bool);
    }

    public void setUsername(String str) {
        realmSet$username(str);
    }
}
