package com.habitrpg.android.habitica.models.user;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.j7;
import qc.h;
import qc.q;

/* compiled from: Profile.kt */
/* loaded from: classes4.dex */
public class Profile extends d1 implements BaseObject, j7 {
    public static final int $stable = 8;
    private String blurb;
    private String imageUrl;
    private String name;
    private User user;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Profile(String str) {
        this(str, null, null, 6, null);
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getBlurb() {
        return realmGet$blurb();
    }

    public final String getImageUrl() {
        return realmGet$imageUrl();
    }

    public final String getName() {
        return realmGet$name();
    }

    public final User getUser$Habitica_2311256681_prodRelease() {
        return realmGet$user();
    }

    @Override // io.realm.j7
    public String realmGet$blurb() {
        return this.blurb;
    }

    @Override // io.realm.j7
    public String realmGet$imageUrl() {
        return this.imageUrl;
    }

    @Override // io.realm.j7
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.j7
    public User realmGet$user() {
        return this.user;
    }

    @Override // io.realm.j7
    public void realmSet$blurb(String str) {
        this.blurb = str;
    }

    @Override // io.realm.j7
    public void realmSet$imageUrl(String str) {
        this.imageUrl = str;
    }

    @Override // io.realm.j7
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // io.realm.j7
    public void realmSet$user(User user) {
        this.user = user;
    }

    public final void setBlurb(String str) {
        realmSet$blurb(str);
    }

    public final void setImageUrl(String str) {
        realmSet$imageUrl(str);
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final void setUser$Habitica_2311256681_prodRelease(User user) {
        realmSet$user(user);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Profile(String str, String str2) {
        this(str, str2, null, 4, null);
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(str2, "blurb");
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public Profile(String str, String str2, String str3) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(str2, "blurb");
        q.i(str3, "imageUrl");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$name(str);
        realmSet$blurb(str2);
        realmSet$imageUrl(str3);
    }

    public /* synthetic */ Profile(String str, String str2, String str3, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public Profile() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }
}
