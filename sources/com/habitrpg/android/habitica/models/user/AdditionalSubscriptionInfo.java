package com.habitrpg.android.habitica.models.user;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.v5;

/* compiled from: AdditionalSubscriptionInfo.kt */
/* loaded from: classes4.dex */
public class AdditionalSubscriptionInfo extends d1 implements v5 {
    public static final int $stable = 8;
    private GoogleSubscriptionData data;

    public AdditionalSubscriptionInfo() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final GoogleSubscriptionData getData() {
        return realmGet$data();
    }

    @Override // io.realm.v5
    public GoogleSubscriptionData realmGet$data() {
        return this.data;
    }

    @Override // io.realm.v5
    public void realmSet$data(GoogleSubscriptionData googleSubscriptionData) {
        this.data = googleSubscriptionData;
    }

    public final void setData(GoogleSubscriptionData googleSubscriptionData) {
        realmSet$data(googleSubscriptionData);
    }
}
