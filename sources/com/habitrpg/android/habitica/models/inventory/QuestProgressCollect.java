package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.p3;

/* compiled from: QuestProgressCollect.kt */
/* loaded from: classes4.dex */
public class QuestProgressCollect extends d1 implements BaseObject, p3 {
    public static final int $stable = 8;
    private int count;
    private String key;

    public QuestProgressCollect() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final int getCount() {
        return realmGet$count();
    }

    public final String getKey() {
        return realmGet$key();
    }

    @Override // io.realm.p3
    public int realmGet$count() {
        return this.count;
    }

    @Override // io.realm.p3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.p3
    public void realmSet$count(int i10) {
        this.count = i10;
    }

    @Override // io.realm.p3
    public void realmSet$key(String str) {
        this.key = str;
    }

    public final void setCount(int i10) {
        realmSet$count(i10);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }
}
