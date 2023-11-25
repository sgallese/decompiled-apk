package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.b6;
import io.realm.d1;
import io.realm.internal.o;

/* compiled from: Backer.kt */
/* loaded from: classes4.dex */
public class Backer extends d1 implements BaseObject, b6 {
    public static final int $stable = 8;
    private String npc;
    private Integer tier;

    public Backer() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getNpc() {
        return realmGet$npc();
    }

    public final Integer getTier() {
        return realmGet$tier();
    }

    @Override // io.realm.b6
    public String realmGet$npc() {
        return this.npc;
    }

    @Override // io.realm.b6
    public Integer realmGet$tier() {
        return this.tier;
    }

    @Override // io.realm.b6
    public void realmSet$npc(String str) {
        this.npc = str;
    }

    @Override // io.realm.b6
    public void realmSet$tier(Integer num) {
        this.tier = num;
    }

    public final void setNpc(String str) {
        realmSet$npc(str);
    }

    public final void setTier(Integer num) {
        realmSet$tier(num);
    }
}
