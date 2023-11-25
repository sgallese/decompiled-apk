package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: m  reason: collision with root package name */
    private final int f11908m;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f11908m = i10;
    }

    public int a() {
        return this.f11908m;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th) {
        super(str, th);
        this.f11908m = i10;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f11908m = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f11908m = i10;
    }
}
