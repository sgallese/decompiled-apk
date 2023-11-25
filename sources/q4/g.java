package q4;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import coil.memory.MemoryCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f5.a;
import f5.c;
import g5.k;
import g5.r;
import g5.v;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.internal.http2.Http2;
import q4.d;

/* compiled from: ImageLoader.kt */
/* loaded from: classes.dex */
public interface g {

    /* compiled from: ImageLoader.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f21395a;

        /* renamed from: b  reason: collision with root package name */
        private b5.b f21396b = k.b();

        /* renamed from: c  reason: collision with root package name */
        private dc.f<? extends MemoryCache> f21397c = null;

        /* renamed from: d  reason: collision with root package name */
        private dc.f<? extends u4.a> f21398d = null;

        /* renamed from: e  reason: collision with root package name */
        private dc.f<? extends Call.Factory> f21399e = null;

        /* renamed from: f  reason: collision with root package name */
        private d.c f21400f = null;

        /* renamed from: g  reason: collision with root package name */
        private q4.b f21401g = null;

        /* renamed from: h  reason: collision with root package name */
        private r f21402h = new r(false, false, false, 0, null, 31, null);

        /* compiled from: ImageLoader.kt */
        /* renamed from: q4.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0481a extends qc.r implements pc.a<MemoryCache> {
            C0481a() {
                super(0);
            }

            @Override // pc.a
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final MemoryCache invoke() {
                return new MemoryCache.a(a.this.f21395a).a();
            }
        }

        /* compiled from: ImageLoader.kt */
        /* loaded from: classes.dex */
        static final class b extends qc.r implements pc.a<u4.a> {
            b() {
                super(0);
            }

            @Override // pc.a
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final u4.a invoke() {
                return v.f16212a.a(a.this.f21395a);
            }
        }

        /* compiled from: ImageLoader.kt */
        /* loaded from: classes.dex */
        static final class c extends qc.r implements pc.a<OkHttpClient> {

            /* renamed from: f  reason: collision with root package name */
            public static final c f21405f = new c();

            c() {
                super(0);
            }

            @Override // pc.a
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final OkHttpClient invoke() {
                return new OkHttpClient();
            }
        }

        public a(Context context) {
            this.f21395a = context.getApplicationContext();
        }

        public final a b(boolean z10) {
            b5.b a10;
            a10 = r1.a((r32 & 1) != 0 ? r1.f7925a : null, (r32 & 2) != 0 ? r1.f7926b : null, (r32 & 4) != 0 ? r1.f7927c : null, (r32 & 8) != 0 ? r1.f7928d : null, (r32 & 16) != 0 ? r1.f7929e : null, (r32 & 32) != 0 ? r1.f7930f : null, (r32 & 64) != 0 ? r1.f7931g : null, (r32 & 128) != 0 ? r1.f7932h : z10, (r32 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? r1.f7933i : false, (r32 & 512) != 0 ? r1.f7934j : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r1.f7935k : null, (r32 & RecyclerView.m.FLAG_MOVED) != 0 ? r1.f7936l : null, (r32 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? r1.f7937m : null, (r32 & 8192) != 0 ? r1.f7938n : null, (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? this.f21396b.f7939o : null);
            this.f21396b = a10;
            return this;
        }

        public final g c() {
            Context context = this.f21395a;
            b5.b bVar = this.f21396b;
            dc.f<? extends MemoryCache> fVar = this.f21397c;
            if (fVar == null) {
                fVar = dc.h.b(new C0481a());
            }
            dc.f<? extends MemoryCache> fVar2 = fVar;
            dc.f<? extends u4.a> fVar3 = this.f21398d;
            if (fVar3 == null) {
                fVar3 = dc.h.b(new b());
            }
            dc.f<? extends u4.a> fVar4 = fVar3;
            dc.f<? extends Call.Factory> fVar5 = this.f21399e;
            if (fVar5 == null) {
                fVar5 = dc.h.b(c.f21405f);
            }
            dc.f<? extends Call.Factory> fVar6 = fVar5;
            d.c cVar = this.f21400f;
            if (cVar == null) {
                cVar = d.c.f21393b;
            }
            d.c cVar2 = cVar;
            q4.b bVar2 = this.f21401g;
            if (bVar2 == null) {
                bVar2 = new q4.b();
            }
            return new j(context, bVar, fVar2, fVar4, fVar6, cVar2, bVar2, this.f21402h, null);
        }

        public final a d(q4.b bVar) {
            this.f21401g = bVar;
            return this;
        }

        public final a e(int i10) {
            c.a aVar;
            if (i10 > 0) {
                aVar = new a.C0372a(i10, false, 2, null);
            } else {
                aVar = c.a.f15451b;
            }
            g(aVar);
            return this;
        }

        public final a f(boolean z10) {
            int i10;
            if (z10) {
                i10 = 100;
            } else {
                i10 = 0;
            }
            return e(i10);
        }

        public final a g(c.a aVar) {
            b5.b a10;
            a10 = r1.a((r32 & 1) != 0 ? r1.f7925a : null, (r32 & 2) != 0 ? r1.f7926b : null, (r32 & 4) != 0 ? r1.f7927c : null, (r32 & 8) != 0 ? r1.f7928d : null, (r32 & 16) != 0 ? r1.f7929e : aVar, (r32 & 32) != 0 ? r1.f7930f : null, (r32 & 64) != 0 ? r1.f7931g : null, (r32 & 128) != 0 ? r1.f7932h : false, (r32 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? r1.f7933i : false, (r32 & 512) != 0 ? r1.f7934j : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r1.f7935k : null, (r32 & RecyclerView.m.FLAG_MOVED) != 0 ? r1.f7936l : null, (r32 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? r1.f7937m : null, (r32 & 8192) != 0 ? r1.f7938n : null, (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? this.f21396b.f7939o : null);
            this.f21396b = a10;
            return this;
        }
    }

    Object a(b5.h hVar, Continuation<? super b5.i> continuation);

    b5.b b();

    b5.d c(b5.h hVar);

    MemoryCache d();

    b getComponents();
}
