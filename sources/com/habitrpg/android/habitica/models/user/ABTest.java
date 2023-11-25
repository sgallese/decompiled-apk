package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.t5;
import qc.q;

/* compiled from: ABTest.kt */
/* loaded from: classes4.dex */
public class ABTest extends d1 implements BaseObject, t5 {
    public static final int $stable = 8;
    private String group;
    private String name;

    public ABTest() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$name("");
        realmSet$group("");
    }

    public final String getGroup() {
        return realmGet$group();
    }

    public final String getName() {
        return realmGet$name();
    }

    @Override // io.realm.t5
    public String realmGet$group() {
        return this.group;
    }

    @Override // io.realm.t5
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.t5
    public void realmSet$group(String str) {
        this.group = str;
    }

    @Override // io.realm.t5
    public void realmSet$name(String str) {
        this.name = str;
    }

    public final void setGroup(String str) {
        q.i(str, "<set-?>");
        realmSet$group(str);
    }

    public final void setName(String str) {
        q.i(str, "<set-?>");
        realmSet$name(str);
    }
}
