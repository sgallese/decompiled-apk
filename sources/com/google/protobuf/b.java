package com.google.protobuf;

import com.google.protobuf.q0;

/* compiled from: AbstractParser.java */
/* loaded from: classes3.dex */
public abstract class b<MessageType extends q0> implements y0<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final o f12253a = o.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype != null && !messagetype.b()) {
            throw d(messagetype).a().j(messagetype);
        }
        return messagetype;
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).t();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // com.google.protobuf.y0
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public MessageType a(h hVar, o oVar) throws InvalidProtocolBufferException {
        return c(f(hVar, oVar));
    }

    public MessageType f(h hVar, o oVar) throws InvalidProtocolBufferException {
        i o10 = hVar.o();
        MessageType messagetype = (MessageType) b(o10, oVar);
        try {
            o10.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.j(messagetype);
        }
    }
}
