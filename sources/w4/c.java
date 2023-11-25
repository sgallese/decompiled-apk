package w4;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import t4.p0;
import w4.i;

/* compiled from: ByteBufferFetcher.kt */
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f25370a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f25371b;

    /* compiled from: ByteBufferFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements i.a<ByteBuffer> {
        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(ByteBuffer byteBuffer, b5.l lVar, q4.g gVar) {
            return new c(byteBuffer, lVar);
        }
    }

    public c(ByteBuffer byteBuffer, b5.l lVar) {
        this.f25370a = byteBuffer;
        this.f25371b = lVar;
    }

    @Override // w4.i
    public Object a(Continuation<? super h> continuation) {
        try {
            okio.c cVar = new okio.c();
            cVar.write(this.f25370a);
            this.f25370a.position(0);
            return new m(p0.a(cVar, this.f25371b.g()), null, t4.f.MEMORY);
        } catch (Throwable th) {
            this.f25370a.position(0);
            throw th;
        }
    }
}
