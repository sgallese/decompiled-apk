package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.e;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new n0();
    @SafeParcelable.Field(id = 2)

    /* renamed from: f  reason: collision with root package name */
    Bundle f11582f;

    /* renamed from: m  reason: collision with root package name */
    private Map<String, String> f11583m;

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f11582f = bundle;
    }

    public Map<String, String> getData() {
        if (this.f11583m == null) {
            this.f11583m = e.a.a(this.f11582f);
        }
        return this.f11583m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        n0.c(this, parcel, i10);
    }
}
