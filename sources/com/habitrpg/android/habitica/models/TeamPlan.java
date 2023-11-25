package com.habitrpg.android.habitica.models;

import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.z1;
import qc.q;

/* compiled from: TeamPlan.kt */
/* loaded from: classes4.dex */
public class TeamPlan extends d1 implements BaseObject, z1 {
    public static final int $stable = 8;

    /* renamed from: id  reason: collision with root package name */
    private String f12508id;
    private boolean isActive;
    @c("leader")
    private String leaderID;
    private String summary;
    private String userID;

    public TeamPlan() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("");
        realmSet$summary("");
    }

    public boolean equals(Object obj) {
        if (obj instanceof TeamPlan) {
            return q.d(realmGet$id(), ((TeamPlan) obj).realmGet$id());
        }
        return super.equals(obj);
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getLeaderID() {
        return realmGet$leaderID();
    }

    public final String getSummary() {
        return realmGet$summary();
    }

    public final String getUserID() {
        return realmGet$userID();
    }

    public int hashCode() {
        return realmGet$id().hashCode();
    }

    public final boolean isActive() {
        return realmGet$isActive();
    }

    @Override // io.realm.z1
    public String realmGet$id() {
        return this.f12508id;
    }

    @Override // io.realm.z1
    public boolean realmGet$isActive() {
        return this.isActive;
    }

    @Override // io.realm.z1
    public String realmGet$leaderID() {
        return this.leaderID;
    }

    @Override // io.realm.z1
    public String realmGet$summary() {
        return this.summary;
    }

    @Override // io.realm.z1
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.z1
    public void realmSet$id(String str) {
        this.f12508id = str;
    }

    @Override // io.realm.z1
    public void realmSet$isActive(boolean z10) {
        this.isActive = z10;
    }

    @Override // io.realm.z1
    public void realmSet$leaderID(String str) {
        this.leaderID = str;
    }

    @Override // io.realm.z1
    public void realmSet$summary(String str) {
        this.summary = str;
    }

    @Override // io.realm.z1
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    public final void setActive(boolean z10) {
        realmSet$isActive(z10);
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setLeaderID(String str) {
        realmSet$leaderID(str);
    }

    public final void setSummary(String str) {
        q.i(str, "<set-?>");
        realmSet$summary(str);
    }

    public final void setUserID(String str) {
        realmSet$userID(str);
    }
}
