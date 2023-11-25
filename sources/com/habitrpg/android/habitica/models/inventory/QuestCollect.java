package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.d3;
import io.realm.internal.o;

/* compiled from: QuestCollect.kt */
/* loaded from: classes4.dex */
public class QuestCollect extends d1 implements BaseObject, d3 {
    public static final int $stable = 8;
    private int count;
    private String key;
    private String text;

    public QuestCollect() {
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

    public final String getText() {
        return realmGet$text();
    }

    @Override // io.realm.d3
    public int realmGet$count() {
        return this.count;
    }

    @Override // io.realm.d3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.d3
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.d3
    public void realmSet$count(int i10) {
        this.count = i10;
    }

    @Override // io.realm.d3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.d3
    public void realmSet$text(String str) {
        this.text = str;
    }

    public final void setCount(int i10) {
        realmSet$count(i10);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }
}
