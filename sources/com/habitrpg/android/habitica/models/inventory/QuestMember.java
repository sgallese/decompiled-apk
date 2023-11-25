package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.n3;

/* compiled from: QuestMember.kt */
/* loaded from: classes4.dex */
public class QuestMember extends d1 implements BaseObject, n3 {
    public static final int $stable = 8;
    private Boolean isParticipating;
    private String key;

    public QuestMember() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final Boolean isParticipating() {
        return realmGet$isParticipating();
    }

    @Override // io.realm.n3
    public Boolean realmGet$isParticipating() {
        return this.isParticipating;
    }

    @Override // io.realm.n3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.n3
    public void realmSet$isParticipating(Boolean bool) {
        this.isParticipating = bool;
    }

    @Override // io.realm.n3
    public void realmSet$key(String str) {
        this.key = str;
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setParticipating(Boolean bool) {
        realmSet$isParticipating(bool);
    }
}
