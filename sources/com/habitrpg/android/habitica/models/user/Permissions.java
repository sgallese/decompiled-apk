package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.f7;
import io.realm.internal.o;

/* compiled from: Permissions.kt */
/* loaded from: classes4.dex */
public class Permissions extends d1 implements BaseObject, f7 {
    public static final int $stable = 8;
    private boolean fullAccess;
    private boolean moderator;
    private boolean userSupport;

    public Permissions() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final boolean getFullAccess() {
        return realmGet$fullAccess();
    }

    public final boolean getModerator() {
        return realmGet$moderator();
    }

    public final boolean getUserSupport() {
        return realmGet$userSupport();
    }

    @Override // io.realm.f7
    public boolean realmGet$fullAccess() {
        return this.fullAccess;
    }

    @Override // io.realm.f7
    public boolean realmGet$moderator() {
        return this.moderator;
    }

    @Override // io.realm.f7
    public boolean realmGet$userSupport() {
        return this.userSupport;
    }

    @Override // io.realm.f7
    public void realmSet$fullAccess(boolean z10) {
        this.fullAccess = z10;
    }

    @Override // io.realm.f7
    public void realmSet$moderator(boolean z10) {
        this.moderator = z10;
    }

    @Override // io.realm.f7
    public void realmSet$userSupport(boolean z10) {
        this.userSupport = z10;
    }

    public final void setFullAccess(boolean z10) {
        realmSet$fullAccess(z10);
    }

    public final void setModerator(boolean z10) {
        realmSet$moderator(z10);
    }

    public final void setUserSupport(boolean z10) {
        realmSet$userSupport(z10);
    }
}
