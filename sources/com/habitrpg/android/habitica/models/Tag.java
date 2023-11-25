package com.habitrpg.android.habitica.models;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.x1;
import qc.q;

/* compiled from: Tag.kt */
/* loaded from: classes4.dex */
public class Tag extends d1 implements BaseObject, x1 {
    public static final int $stable = 8;
    private boolean challenge;
    private String group;

    /* renamed from: id  reason: collision with root package name */
    private String f12507id;
    private String name;
    private String userId;

    public Tag() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("");
        realmSet$name("");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Tag) {
            return q.d(realmGet$id(), ((Tag) obj).realmGet$id());
        }
        return super.equals(obj);
    }

    public final boolean getChallenge$Habitica_2311256681_prodRelease() {
        return realmGet$challenge();
    }

    public final String getGroup() {
        return realmGet$group();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getName() {
        return realmGet$name();
    }

    public final String getUserId() {
        return realmGet$userId();
    }

    public int hashCode() {
        return realmGet$id().hashCode();
    }

    @Override // io.realm.x1
    public boolean realmGet$challenge() {
        return this.challenge;
    }

    @Override // io.realm.x1
    public String realmGet$group() {
        return this.group;
    }

    @Override // io.realm.x1
    public String realmGet$id() {
        return this.f12507id;
    }

    @Override // io.realm.x1
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.x1
    public String realmGet$userId() {
        return this.userId;
    }

    @Override // io.realm.x1
    public void realmSet$challenge(boolean z10) {
        this.challenge = z10;
    }

    @Override // io.realm.x1
    public void realmSet$group(String str) {
        this.group = str;
    }

    @Override // io.realm.x1
    public void realmSet$id(String str) {
        this.f12507id = str;
    }

    @Override // io.realm.x1
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // io.realm.x1
    public void realmSet$userId(String str) {
        this.userId = str;
    }

    public final void setChallenge$Habitica_2311256681_prodRelease(boolean z10) {
        realmSet$challenge(z10);
    }

    public final void setGroup(String str) {
        realmSet$group(str);
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setName(String str) {
        q.i(str, "<set-?>");
        realmSet$name(str);
    }

    public final void setUserId(String str) {
        realmSet$userId(str);
    }
}
