package t4;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import t4.o0;

/* compiled from: ImageSource.kt */
/* loaded from: classes.dex */
public final class p0 {

    /* compiled from: ImageSource.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<File> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f23605f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f23605f = context;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return g5.l.m(this.f23605f);
        }
    }

    /* compiled from: ImageSource.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<File> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f23606f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f23606f = context;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return g5.l.m(this.f23606f);
        }
    }

    public static final o0 a(okio.e eVar, Context context) {
        return new r0(eVar, new a(context), null);
    }

    public static final o0 b(okio.e eVar, Context context, o0.a aVar) {
        return new r0(eVar, new b(context), aVar);
    }

    public static final o0 c(okio.r0 r0Var, okio.j jVar, String str, Closeable closeable) {
        return new o(r0Var, jVar, str, closeable, null);
    }

    public static /* synthetic */ o0 d(okio.r0 r0Var, okio.j jVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jVar = okio.j.f20647b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return c(r0Var, jVar, str, closeable);
    }
}
