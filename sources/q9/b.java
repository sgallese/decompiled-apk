package q9;

import com.google.firebase.messaging.h0;
import e9.d;

/* compiled from: MessagingClientEventExtension.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f21643b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final q9.a f21644a;

    /* compiled from: MessagingClientEventExtension.java */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private q9.a f21645a = null;

        a() {
        }

        public b a() {
            return new b(this.f21645a);
        }

        public a b(q9.a aVar) {
            this.f21645a = aVar;
            return this;
        }
    }

    b(q9.a aVar) {
        this.f21644a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public q9.a a() {
        return this.f21644a;
    }

    public byte[] c() {
        return h0.a(this);
    }
}
