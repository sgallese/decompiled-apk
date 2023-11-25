package ad;

import hc.f;
import java.io.Closeable;

/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
public abstract class m1 extends g0 implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final a f535m = new a(null);

    /* compiled from: Executors.kt */
    /* loaded from: classes4.dex */
    public static final class a extends hc.b<g0, m1> {

        /* compiled from: Executors.kt */
        /* renamed from: ad.m1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0008a extends qc.r implements pc.l<f.b, m1> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0008a f536f = new C0008a();

            C0008a() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final m1 invoke(f.b bVar) {
                if (bVar instanceof m1) {
                    return (m1) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        private a() {
            super(g0.f510f, C0008a.f536f);
        }
    }
}
