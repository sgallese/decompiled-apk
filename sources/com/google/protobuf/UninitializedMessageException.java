package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f12252f;

    public UninitializedMessageException(q0 q0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f12252f = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
