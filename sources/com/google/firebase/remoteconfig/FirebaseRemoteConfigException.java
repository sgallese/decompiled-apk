package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: f  reason: collision with root package name */
    private final a f11906f;

    /* loaded from: classes3.dex */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f11906f = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.f11906f = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, a aVar) {
        super(str);
        this.f11906f = aVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, a aVar) {
        super(str, th);
        this.f11906f = aVar;
    }
}
