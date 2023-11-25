package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.z7;
import qc.q;

/* compiled from: UserAchievement.kt */
/* loaded from: classes4.dex */
public class UserAchievement extends d1 implements BaseObject, z7 {
    public static final int $stable = 8;
    private boolean earned;
    private String key;

    public UserAchievement() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final boolean getEarned() {
        return realmGet$earned();
    }

    public final String getKey() {
        return realmGet$key();
    }

    @Override // io.realm.z7
    public boolean realmGet$earned() {
        return this.earned;
    }

    @Override // io.realm.z7
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.z7
    public void realmSet$earned(boolean z10) {
        this.earned = z10;
    }

    @Override // io.realm.z7
    public void realmSet$key(String str) {
        this.key = str;
    }

    public final void setEarned(boolean z10) {
        realmSet$earned(z10);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserAchievement(String str, boolean z10) {
        this();
        q.i(str, "key");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key(str);
        realmSet$earned(z10);
    }
}
