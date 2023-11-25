package com.google.firebase.crashlytics.internal.common;

/* compiled from: DeliveryMechanism.java */
/* loaded from: classes3.dex */
public enum t {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id  reason: collision with root package name */
    private final int f11477id;

    t(int i10) {
        this.f11477id = i10;
    }

    public static t determineFrom(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int getId() {
        return this.f11477id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f11477id);
    }
}
