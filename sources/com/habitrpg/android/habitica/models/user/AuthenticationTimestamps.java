package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.z5;
import java.util.Date;

/* compiled from: AuthenticationTimestamps.kt */
/* loaded from: classes4.dex */
public class AuthenticationTimestamps extends d1 implements BaseObject, z5 {
    public static final int $stable = 8;
    @c("created")
    private Date createdAt;
    @c("loggedin")
    private Date lastLoggedIn;

    public AuthenticationTimestamps() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Date getCreatedAt() {
        return realmGet$createdAt();
    }

    public final Date getLastLoggedIn() {
        return realmGet$lastLoggedIn();
    }

    @Override // io.realm.z5
    public Date realmGet$createdAt() {
        return this.createdAt;
    }

    @Override // io.realm.z5
    public Date realmGet$lastLoggedIn() {
        return this.lastLoggedIn;
    }

    @Override // io.realm.z5
    public void realmSet$createdAt(Date date) {
        this.createdAt = date;
    }

    @Override // io.realm.z5
    public void realmSet$lastLoggedIn(Date date) {
        this.lastLoggedIn = date;
    }

    public final void setCreatedAt(Date date) {
        realmSet$createdAt(date);
    }

    public final void setLastLoggedIn(Date date) {
        realmSet$lastLoggedIn(date);
    }
}
