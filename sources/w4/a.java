package w4;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import ec.b0;
import java.util.List;
import kotlin.coroutines.Continuation;
import okio.l0;
import t4.p0;
import w4.i;

/* compiled from: AssetUriFetcher.kt */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f25366a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f25367b;

    /* compiled from: AssetUriFetcher.kt */
    /* renamed from: w4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0582a implements i.a<Uri> {
        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, b5.l lVar, q4.g gVar) {
            if (!g5.l.q(uri)) {
                return null;
            }
            return new a(uri, lVar);
        }
    }

    public a(Uri uri, b5.l lVar) {
        this.f25366a = uri;
        this.f25367b = lVar;
    }

    @Override // w4.i
    public Object a(Continuation<? super h> continuation) {
        List V;
        String k02;
        V = b0.V(this.f25366a.getPathSegments(), 1);
        k02 = b0.k0(V, "/", null, null, 0, null, null, 62, null);
        return new m(p0.b(l0.d(l0.k(this.f25367b.g().getAssets().open(k02))), this.f25367b.g(), new t4.a(k02)), g5.l.j(MimeTypeMap.getSingleton(), k02), t4.f.DISK);
    }
}
