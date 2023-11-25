package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes3.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: f  reason: collision with root package name */
    private final a f11515f;

    /* loaded from: classes3.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.f11515f = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.f11515f = aVar;
    }
}
