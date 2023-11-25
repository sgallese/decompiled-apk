package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.t3;
import qc.q;

/* compiled from: QuestRageStrike.kt */
/* loaded from: classes4.dex */
public class QuestRageStrike extends d1 implements BaseObject, t3 {
    public static final int $stable = 8;
    private String key;
    private boolean wasHit;

    public QuestRageStrike() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final boolean getWasHit() {
        return realmGet$wasHit();
    }

    @Override // io.realm.t3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.t3
    public boolean realmGet$wasHit() {
        return this.wasHit;
    }

    @Override // io.realm.t3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.t3
    public void realmSet$wasHit(boolean z10) {
        this.wasHit = z10;
    }

    public final void setKey(String str) {
        q.i(str, "<set-?>");
        realmSet$key(str);
    }

    public final void setWasHit(boolean z10) {
        realmSet$wasHit(z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuestRageStrike(String str, boolean z10) {
        this();
        q.i(str, "key");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key(str);
        realmSet$wasHit(z10);
    }
}
